package kz.aitu.esports.family.r6;

import kz.aitu.esports.product.AntiCheat;

public class R6AntiCheat implements AntiCheat {

    @Override
    public boolean verifyPlayer(String playerName) {

        System.out.println(
                "Rainbow Six AntiCheat checking " + playerName
        );

        return !playerName.equalsIgnoreCase("banned");
    }

    @Override
    public String getGame() {
        return "Rainbow Six";
    }
}