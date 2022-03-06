package com.turn_based_game.model;

import com.turn_based_game.model.actions.Action;

@Deprecated
public class Enemy extends Combatant {

    // Constructors
    public Enemy(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        super(name, maxHealth, maxDefence, actionsAvailable, false);
    }

    // Behaviors

    //Choose a random action from actions
    // TODO: implement this.
    @Override
    @Deprecated
    public Action promptForAction(){
        return null;
    }

}
