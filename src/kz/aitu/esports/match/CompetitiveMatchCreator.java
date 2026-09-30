package kz.aitu.esports.match;

public class CompetitiveMatchCreator extends MatchCreator {

    @Override
    protected Match createMatch() {
        return new CompetitiveMatch();
    }
}