package kz.aitu.esports.family.cs2;

import kz.aitu.esports.product.AntiCheat;

public class CS2AntiCheat implements AntiCheat {

    @Override
    public boolean verifyPlayer(String playerName) {

        System.out.println(
                "CS2 AntiCheat checking " + playerName
        );

        return !playerName.equalsIgnoreCase("banned");
    }

    @Override
    public String getGame() {
        return "CS2";
    }
}