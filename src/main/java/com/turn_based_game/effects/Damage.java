package com.turn_based_game.effects;

import com.turn_based_game.Combatant;
@Deprecated
public class Damage extends Effect{
    // Constructors

    public Damage(Combatant target, int power){
        super(target, power);
    }

    // Getters and Setters
    // Behaviors
    @Override
    public void ApplyEffect(){
        target.decreaseHealth(power);
    }
}
