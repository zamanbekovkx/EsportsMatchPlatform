package kz.aitu.esports.factory;

import kz.aitu.esports.family.apex.ApexFactory;
import kz.aitu.esports.family.cs2.CS2Factory;
import kz.aitu.esports.family.valorant.ValorantFactory;

public class FactoryProvider {

    public static EsportsFactory getFactory(String game) {

        return switch (game.toLowerCase()) {

            case "cs2" ->
                    new CS2Factory();

            case "valorant" ->
                    new ValorantFactory();

            case "apex" ->
                    new ApexFactory();

            default ->
                    throw new IllegalArgumentException(
                            "Unknown game: " + game
                    );
        };
    }
}