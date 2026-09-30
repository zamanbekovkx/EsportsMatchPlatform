package kz.aitu.esports.family.apex;

import kz.aitu.esports.product.GameServer;

public class ApexServer implements GameServer {

    private boolean running;

    @Override
    public void start() {
        running = true;
        System.out.println("Apex server started.");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("Apex server stopped.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getGame() {
        return "Apex";
    }
}