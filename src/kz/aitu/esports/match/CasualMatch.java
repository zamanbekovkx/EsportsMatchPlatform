package kz.aitu.esports.match;

public class CasualMatch implements Match {

    @Override
    public void configure() {
        System.out.println("Casual rules configured.");
    }

    @Override
    public int getMaxPlayers() {
        return 10;
    }

    @Override
    public String getMode() {
        return "Casual";
    }
}