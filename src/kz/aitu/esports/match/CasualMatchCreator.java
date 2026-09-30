package kz.aitu.esports.match;

public class CasualMatchCreator extends MatchCreator {

    @Override
    protected Match createMatch() {
        return new CasualMatch();
    }
}