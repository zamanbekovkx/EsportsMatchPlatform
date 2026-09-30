package kz.aitu.esports;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.factory.FactoryProvider;
import kz.aitu.esports.match.CompetitiveMatchCreator;
import kz.aitu.esports.match.MatchCreator;
import kz.aitu.esports.service.GameEnvironment;
import kz.aitu.esports.service.MatchService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Choose game: CS2 / Valorant / Apex"
        );

        String game = scanner.nextLine();

        EsportsFactory factory =
                FactoryProvider.getFactory(game);

        GameEnvironment environment =
                new GameEnvironment(factory);

        MatchCreator matchCreator =
                new CompetitiveMatchCreator();

        matchCreator.prepareMatch();

        MatchService service =
                new MatchService(environment);

        String[] players = {
                "Olzhas",
                "Player2",
                "Player3"
        };

        if (service.prepareMatch(players)) {

            service.startMatch();

            service.finishMatch();
        }
    }
}