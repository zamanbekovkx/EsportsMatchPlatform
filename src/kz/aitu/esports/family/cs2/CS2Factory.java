package kz.aitu.esports.family.cs2;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class CS2Factory implements EsportsFactory {

    @Override
    public GameServer createServer() {
        return new CS2Server();
    }

    @Override
    public AntiCheat createAntiCheat() {
        return new CS2AntiCheat();
    }

    @Override
    public ReplaySystem createReplaySystem() {
        return new CS2Replay();
    }

    @Override
    public String getFamilyName() {
        return "CS2";
    }
}