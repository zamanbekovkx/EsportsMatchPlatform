package kz.aitu.esports.match;

public abstract class MatchCreator {

    protected abstract Match createMatch();

    public Match prepareMatch() {

        Match match = createMatch();

        System.out.println("Preparing match...");

        match.configure();

        System.out.println(
                "Mode: " + match.getMode()
                        + ", max players: "
                        + match.getMaxPlayers()
        );

        return match;
    }
}