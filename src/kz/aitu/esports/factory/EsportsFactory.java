package kz.aitu.esports.factory;

import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public interface EsportsFactory {

    GameServer createServer();

    AntiCheat createAntiCheat();

    ReplaySystem createReplaySystem();

    String getFamilyName();
}