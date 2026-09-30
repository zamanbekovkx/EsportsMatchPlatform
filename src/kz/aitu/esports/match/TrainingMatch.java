package kz.aitu.esports.match;

public class TrainingMatch implements Match {

    @Override
    public void configure() {
        System.out.println("Training mode configured.");
    }

    @Override
    public int getMaxPlayers() {
        return 5;
    }

    @Override
    public String getMode() {
        return "Training";
    }
}