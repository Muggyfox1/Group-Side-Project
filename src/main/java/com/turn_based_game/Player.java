package com.turn_based_game;

import java.util.Arrays;

public class Player extends Combatant {

    // Constructors
    public Player(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        super(name, maxHealth, maxDefence, actionsAvailable);
    }

    public void promptPlayerForAction() {}
}
