package com.turn_based_game.effects;

import com.turn_based_game.Combatant;

public class DecreaseDefence extends Effect {

    public DecreaseDefence(Combatant target, int power){
        super(target, power);
    }

    @Override
    public void ApplyEffect(){
        target.decreaseDefense(power);
    }
}
