package kz.aitu.esports.family.valorant;

import kz.aitu.esports.product.ReplaySystem;

public class ValorantReplay implements ReplaySystem {

    private boolean recording;
    private boolean saved;

    @Override
    public void startRecording() {
        recording = true;
        saved = false;

        System.out.println(
                "Valorant replay recording started."
        );
    }

    @Override
    public void saveReplay() {
        recording = false;
        saved = true;

        System.out.println(
                "Valorant replay saved."
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
        return "Valorant";
    }
}