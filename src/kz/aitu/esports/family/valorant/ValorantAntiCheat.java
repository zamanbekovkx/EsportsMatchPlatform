package kz.aitu.esports.family.valorant;

import kz.aitu.esports.product.AntiCheat;

public class ValorantAntiCheat implements AntiCheat {

    @Override
    public boolean verifyPlayer(String playerName) {

        System.out.println(
                "Valorant Vanguard checking " + playerName
        );

        return !playerName.equalsIgnoreCase("banned");
    }

    @Override
    public String getGame() {
        return "Valorant";
    }
}