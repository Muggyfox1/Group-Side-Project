package com.turn_based_game;

import com.turn_based_game.actions.Action;

public class Enemy extends Combatant {

    // Constructors
    public Enemy(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        super(name, maxHealth, maxDefence, actionsAvailable);
    }

    // Behaviors
    public void chooseRandomAction() {}

}
