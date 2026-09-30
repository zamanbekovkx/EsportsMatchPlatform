package kz.aitu.esports.family.valorant;

import kz.aitu.esports.product.GameServer;

public class ValorantServer implements GameServer {

    private boolean running;

    @Override
    public void start() {
        running = true;
        System.out.println("Valorant server started.");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("Valorant server stopped.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getGame() {
        return "Valorant";
    }
}