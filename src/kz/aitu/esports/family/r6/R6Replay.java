package kz.aitu.esports.family.r6;

import kz.aitu.esports.product.ReplaySystem;

public class R6Replay implements ReplaySystem {

    private boolean recording;
    private boolean saved;

    @Override
    public void startRecording() {
        recording = true;
        saved = false;

        System.out.println(
                "Rainbow Six replay recording started."
        );
    }

    @Override
    public void saveReplay() {
        recording = false;
        saved = true;

        System.out.println(
                "Rainbow Six replay saved."
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
        return "Rainbow Six";
    }
}