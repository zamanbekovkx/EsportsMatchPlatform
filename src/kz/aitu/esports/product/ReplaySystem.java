package kz.aitu.esports.product;

public interface ReplaySystem {

    void startRecording();

    void saveReplay();

    boolean isRecording();

    boolean isSaved();

    String getGame();
}