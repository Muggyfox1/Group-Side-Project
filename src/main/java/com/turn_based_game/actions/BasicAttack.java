package com.turn_based_game.actions;

import com.turn_based_game.Combatant;

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
