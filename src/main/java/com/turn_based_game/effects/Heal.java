package com.turn_based_game.effects;

import com.turn_based_game.Combatant;
@Deprecated
public class Heal extends Effect{
    // Constructors

    public Heal(Combatant target, int power){
        super(target, power);
    }

    // Getters and Setters
    // Behaviors
    @Override
    public void ApplyEffect(){
        target.increaseHealth(power);
    }
}
