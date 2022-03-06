package com.turn_based_game.utility;

public class General {
    public static void delay(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {

        }
    }
}
