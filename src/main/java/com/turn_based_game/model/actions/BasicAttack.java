package com.turn_based_game.model.actions;

import com.turn_based_game.model.Combatant;

@Deprecated
 public class BasicAttack extends Action{
    // Instance Variables


    // Constructors
    public BasicAttack(){
        super("Basic Attack",100, 5);
    }

    // Getters and Setters


    // Behaviors
    @Override
    public void execute(Combatant self, Combatant target){
        target.decreaseHealth(getPower());
    }

}
