package kz.aitu.esports.family.r6;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class R6Factory implements EsportsFactory {

    @Override
    public GameServer createServer() {
        return new R6Server();
    }

    @Override
    public AntiCheat createAntiCheat() {
        return new R6AntiCheat();
    }

    @Override
    public ReplaySystem createReplaySystem() {
        return new R6Replay();
    }

    @Override
    public String getFamilyName() {
        return "Rainbow Six";
    }
}