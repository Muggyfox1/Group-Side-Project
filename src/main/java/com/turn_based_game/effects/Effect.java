package com.turn_based_game.effects;

import com.turn_based_game.Combatant;

public abstract class Effect {
    Combatant target;
    int power;

    public Effect(Combatant target, int power){
        this.target = target;
        this.power = power;
    }

    public abstract void ApplyEffect();
}

