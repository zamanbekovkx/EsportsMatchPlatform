package kz.aitu.esports.product;

public interface GameServer {

    void start();

    void stop();

    boolean isRunning();

    String getGame();
}