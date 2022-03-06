package com.turn_based_game.model;

import com.turn_based_game.model.actions.Action;

@Deprecated
public class Player extends Combatant {

    // Constructors
    public Player(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        super(name, maxHealth, maxDefence, actionsAvailable, true);
    }

    // Behaviors

    //present actions to player and get response.
    // TODO: implement this.
    @Override
    @Deprecated
    public Action promptForAction(){
        return null;
    }
}
