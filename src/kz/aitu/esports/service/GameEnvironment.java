package kz.aitu.esports.service;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class GameEnvironment {

    private final GameServer server;
    private final AntiCheat antiCheat;
    private final ReplaySystem replaySystem;

    public GameEnvironment(EsportsFactory factory) {

        this.server = factory.createServer();
        this.antiCheat = factory.createAntiCheat();
        this.replaySystem = factory.createReplaySystem();
    }

    public GameServer getServer() {
        return server;
    }

    public AntiCheat getAntiCheat() {
        return antiCheat;
    }

    public ReplaySystem getReplaySystem() {
        return replaySystem;
    }
}