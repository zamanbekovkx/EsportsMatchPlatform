package kz.aitu.esports.family.valorant;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class ValorantFactory implements EsportsFactory {

    @Override
    public GameServer createServer() {
        return new ValorantServer();
    }

    @Override
    public AntiCheat createAntiCheat() {
        return new ValorantAntiCheat();
    }

    @Override
    public ReplaySystem createReplaySystem() {
        return new ValorantReplay();
    }

    @Override
    public String getFamilyName() {
        return "Valorant";
    }
}