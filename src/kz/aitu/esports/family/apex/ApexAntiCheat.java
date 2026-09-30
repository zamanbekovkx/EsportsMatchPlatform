package kz.aitu.esports.family.apex;

import kz.aitu.esports.product.AntiCheat;

public class ApexAntiCheat implements AntiCheat {

    @Override
    public boolean verifyPlayer(String playerName) {

        System.out.println(
                "Apex AntiCheat checking " + playerName
        );

        return !playerName.equalsIgnoreCase("banned");
    }

    @Override
    public String getGame() {
        return "Apex";
    }
}