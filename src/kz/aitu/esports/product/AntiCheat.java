package kz.aitu.esports.product;

public interface AntiCheat {

    boolean verifyPlayer(String playerName);

    String getGame();
}