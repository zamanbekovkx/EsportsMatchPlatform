package kz.aitu.esports.legacy;

public class LegacyMatchLauncher {

    public void launch(String game) {

        if (game.equalsIgnoreCase("CS2")) {

            System.out.println("CS2 server started");
            System.out.println("CS2 anti-cheat checking player");
            System.out.println("CS2 replay recording");

        } else if (game.equalsIgnoreCase("Valorant")) {

            System.out.println("Valorant server started");
            System.out.println("Valorant anti-cheat checking player");
            System.out.println("Valorant replay recording");

        } else if (game.equalsIgnoreCase("Apex")) {

            System.out.println("Apex server started");
            System.out.println("Apex anti-cheat checking player");
            System.out.println("Apex replay recording");

        } else {

            System.out.println("Unknown game");
        }
    }
}