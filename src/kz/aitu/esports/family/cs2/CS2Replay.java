package kz.aitu.esports.family.cs2;

import kz.aitu.esports.product.ReplaySystem;

public class CS2Replay implements ReplaySystem {

    private boolean recording;
    private boolean saved;

    @Override
    public void startRecording() {
        recording = true;
        saved = false;

        System.out.println(
                "CS2 replay recording started."
        );
    }

    @Override
    public void saveReplay() {
        recording = false;
        saved = true;

        System.out.println(
                "CS2 replay saved."
        );
    }

    @Override
    public boolean isRecording() {
        return recording;
    }

    @Override
    public boolean isSaved() {
        return saved;
    }

    @Override
    public String getGame() {
        return "CS2";
    }
}