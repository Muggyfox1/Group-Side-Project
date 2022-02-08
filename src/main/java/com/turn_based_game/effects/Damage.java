package com.turn_based_game.effects;

import com.turn_based_game.Combatant;

public class Damage extends Effect{

    public Damage(Combatant target, int power){
        super(target, power);
    }

    @Override
    public void ApplyEffect(){
        target.decreaseHealth(power);
    }
}
