package kz.aitu.esports.family.apex;

import kz.aitu.esports.factory.EsportsFactory;
import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class ApexFactory implements EsportsFactory {

    @Override
    public GameServer createServer() {
        return new ApexServer();
    }

    @Override
    public AntiCheat createAntiCheat() {
        return new ApexAntiCheat();
    }

    @Override
    public ReplaySystem createReplaySystem() {
        return new ApexReplay();
    }

    @Override
    public String getFamilyName() {
        return "Apex";
    }
}