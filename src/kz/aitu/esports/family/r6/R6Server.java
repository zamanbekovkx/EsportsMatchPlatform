package kz.aitu.esports.family.r6;

import kz.aitu.esports.product.GameServer;

public class R6Server implements GameServer {

    private boolean running;

    @Override
    public void start() {
        running = true;
        System.out.println("Rainbow Six server started.");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("Rainbow Six server stopped.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getGame() {
        return "Rainbow Six";
    }
}