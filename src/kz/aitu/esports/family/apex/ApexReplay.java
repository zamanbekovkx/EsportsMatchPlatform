package kz.aitu.esports.family.apex;

import kz.aitu.esports.product.ReplaySystem;

public class ApexReplay implements ReplaySystem {

    private boolean recording;
    private boolean saved;

    @Override
    public void startRecording() {
        recording = true;
        saved = false;

        System.out.println(
                "Apex replay recording started."
        );
    }

    @Override
    public void saveReplay() {
        recording = false;
        saved = true;

        System.out.println(
                "Apex replay saved."
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
        return "Apex";
    }
}