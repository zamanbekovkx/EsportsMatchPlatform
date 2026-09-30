package kz.aitu.esports;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.factory.FactoryProvider;

import kz.aitu.esports.family.apex.ApexFactory;
import kz.aitu.esports.family.cs2.CS2Factory;
import kz.aitu.esports.family.r6.R6Factory;
import kz.aitu.esports.family.valorant.ValorantFactory;

import kz.aitu.esports.match.CasualMatchCreator;
import kz.aitu.esports.match.CompetitiveMatchCreator;
import kz.aitu.esports.match.Match;
import kz.aitu.esports.match.TrainingMatchCreator;

import kz.aitu.esports.service.GameEnvironment;
import kz.aitu.esports.service.MatchService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EsportsPlatformTest {

    @Test
    void cs2FactoryHasCorrectName() {
        EsportsFactory factory = new CS2Factory();

        assertEquals("CS2", factory.getFamilyName());
    }

    @Test
    void cs2ProductsBelongToSameFamily() {

        GameEnvironment environment =
                new GameEnvironment(new CS2Factory());

        assertEquals(
                "CS2",
                environment.getServer().getGame()
        );

        assertEquals(
                "CS2",
                environment.getAntiCheat().getGame()
        );

        assertEquals(
                "CS2",
                environment.getReplaySystem().getGame()
        );
    }

    @Test
    void valorantProductsBelongToSameFamily() {

        GameEnvironment environment =
                new GameEnvironment(new ValorantFactory());

        assertEquals(
                "Valorant",
                environment.getServer().getGame()
        );

        assertEquals(
                "Valorant",
                environment.getAntiCheat().getGame()
        );

        assertEquals(
                "Valorant",
                environment.getReplaySystem().getGame()
        );
    }

    @Test
    void apexProductsBelongToSameFamily() {

        GameEnvironment environment =
                new GameEnvironment(new ApexFactory());

        assertEquals(
                "Apex",
                environment.getServer().getGame()
        );

        assertEquals(
                "Apex",
                environment.getAntiCheat().getGame()
        );

        assertEquals(
                "Apex",
                environment.getReplaySystem().getGame()
        );
    }

    @Test
    void runtimeSelectionReturnsCS2() {

        EsportsFactory factory =
                FactoryProvider.getFactory("cs2");

        assertTrue(factory instanceof CS2Factory);
    }

    @Test
    void runtimeSelectionReturnsValorant() {

        EsportsFactory factory =
                FactoryProvider.getFactory("valorant");

        assertTrue(factory instanceof ValorantFactory);
    }

    @Test
    void runtimeSelectionReturnsApex() {

        EsportsFactory factory =
                FactoryProvider.getFactory("apex");

        assertTrue(factory instanceof ApexFactory);
    }

    @Test
    void unknownGameThrowsException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> FactoryProvider.getFactory("Minecraft")
        );
    }

    @Test
    void normalPlayerPassesAntiCheat() {

        GameEnvironment environment =
                new GameEnvironment(new CS2Factory());

        assertTrue(
                environment
                        .getAntiCheat()
                        .verifyPlayer("Olzhas")
        );
    }

    @Test
    void bannedPlayerFailsAntiCheat() {

        GameEnvironment environment =
                new GameEnvironment(new CS2Factory());

        assertFalse(
                environment
                        .getAntiCheat()
                        .verifyPlayer("banned")
        );
    }

    @Test
    void validPlayersPrepareMatch() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        String[] players = {
                "Olzhas",
                "Player2"
        };

        assertTrue(
                service.prepareMatch(players)
        );
    }

    @Test
    void bannedPlayerStopsPreparation() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        String[] players = {
                "Olzhas",
                "banned"
        };

        assertFalse(
                service.prepareMatch(players)
        );
    }

    @Test
    void startMatchStartsServer() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        service.startMatch();

        assertTrue(
                service.getServer().isRunning()
        );
    }

    @Test
    void startMatchStartsReplayRecording() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        service.startMatch();

        assertTrue(
                service.getReplay().isRecording()
        );
    }

    @Test
    void finishMatchStopsServer() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        service.startMatch();
        service.finishMatch();

        assertFalse(
                service.getServer().isRunning()
        );
    }

    @Test
    void finishMatchSavesReplay() {

        MatchService service =
                new MatchService(
                        new GameEnvironment(
                                new CS2Factory()
                        )
                );

        service.startMatch();
        service.finishMatch();

        assertTrue(
                service.getReplay().isSaved()
        );
    }

    @Test
    void competitiveCreatorCreatesCompetitiveMatch() {

        Match match =
                new CompetitiveMatchCreator()
                        .prepareMatch();

        assertEquals(
                "Competitive",
                match.getMode()
        );
    }

    @Test
    void casualCreatorCreatesCasualMatch() {

        Match match =
                new CasualMatchCreator()
                        .prepareMatch();

        assertEquals(
                "Casual",
                match.getMode()
        );
    }

    @Test
    void trainingCreatorCreatesTrainingMatch() {

        Match match =
                new TrainingMatchCreator()
                        .prepareMatch();

        assertEquals(
                "Training",
                match.getMode()
        );
    }

    @Test
    void r6FactoryCreatesCompatibleProducts() {

        GameEnvironment environment =
                new GameEnvironment(new R6Factory());

        assertEquals(
                "Rainbow Six",
                environment.getServer().getGame()
        );

        assertEquals(
                "Rainbow Six",
                environment.getAntiCheat().getGame()
        );

        assertEquals(
                "Rainbow Six",
                environment.getReplaySystem().getGame()
        );
    }

    @Test
    void runtimeSelectionSupportsR6() {

        EsportsFactory factory =
                FactoryProvider.getFactory("r6");

        assertTrue(
                factory instanceof R6Factory
        );
    }
}