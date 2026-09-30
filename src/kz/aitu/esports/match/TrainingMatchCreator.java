package kz.aitu.esports.match;

public class TrainingMatchCreator extends MatchCreator {

    @Override
    protected Match createMatch() {
        return new TrainingMatch();
    }
}