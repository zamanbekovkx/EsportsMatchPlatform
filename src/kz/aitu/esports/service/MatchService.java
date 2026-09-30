package kz.aitu.esports.service;

import kz.aitu.esports.product.AntiCheat;
import kz.aitu.esports.product.GameServer;
import kz.aitu.esports.product.ReplaySystem;

public class MatchService {

    private final GameServer server;
    private final AntiCheat antiCheat;
    private final ReplaySystem replay;

    public MatchService(GameEnvironment environment) {

        this.server =
                environment.getServer();

        this.antiCheat =
                environment.getAntiCheat();

        this.replay =
                environment.getReplaySystem();
    }

    public boolean prepareMatch(String[] players) {

        System.out.println("Checking players...");

        for (String player : players) {

            if (!antiCheat.verifyPlayer(player)) {

                System.out.println(
                        "Player rejected: " + player
                );

                return false;
            }
        }

        System.out.println(
                "All players verified."
        );

        return true;
    }

    public void startMatch() {

        server.start();

        replay.startRecording();

        System.out.println(
                "Match started."
        );
    }

    public void finishMatch() {

        replay.saveReplay();

        server.stop();

        System.out.println(
                "Match finished."
        );
    }

    public GameServer getServer() {
        return server;
    }

    public ReplaySystem getReplay() {
        return replay;
    }
}