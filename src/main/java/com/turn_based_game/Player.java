package com.turn_based_game;

import com.turn_based_game.actions.Action;

import java.util.Arrays;

public class Player extends Combatant {

    // Constructors
    public Player(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        super(name, maxHealth, maxDefence, actionsAvailable);
    }

    // Behaviors

    //present actions to player and get response.
    // TODO: implement this.
    @Override
    public Action promptForAction(){
        return null;
    }
}
