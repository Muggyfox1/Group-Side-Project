package com.turn_based_game.actions;

import com.turn_based_game.Combatant;
import com.turn_based_game.effects.Effect;

import java.util.List;

public class BasicAttack extends Action{
    // Instance Variables


    // Constructors
    public BasicAttack(){
        super(100, 5);
    }

    // Getters and Setters


    // Behaviors
    public void doAction(Combatant self, Combatant target){
        target.decreaseHealth(getPower());
    }

}
