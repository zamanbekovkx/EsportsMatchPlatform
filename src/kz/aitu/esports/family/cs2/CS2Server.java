package kz.aitu.esports.family.cs2;

import kz.aitu.esports.product.GameServer;

public class CS2Server implements GameServer {

    private boolean running;

    @Override
    public void start() {
        running = true;
        System.out.println("CS2 server started.");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("CS2 server stopped.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getGame() {
        return "CS2";
    }
}