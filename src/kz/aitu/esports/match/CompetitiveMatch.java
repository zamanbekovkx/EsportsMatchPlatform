package kz.aitu.esports.match;

public class CompetitiveMatch implements Match {

    @Override
    public void configure() {
        System.out.println("Competitive rules configured.");
    }

    @Override
    public int getMaxPlayers() {
        return 10;
    }

    @Override
    public String getMode() {
        return "Competitive";
    }
}