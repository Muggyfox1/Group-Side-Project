package com.turn_based_game.actions;

import com.turn_based_game.Combatant;
import com.turn_based_game.effects.Effect;

import java.util.ArrayList;
import java.util.List;

public abstract class Action {
    // Instance Variables
    private String name;
    private int accuracy;
    private int power;

    // Constructors
    public Action(String name, int accuracy, int power){
        this.name = name;
        this.accuracy = accuracy;
        this.power = power;
    }

    // Getters and Setters
    public int getAccuracy() {
        return accuracy;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    // Behaviors
    public abstract void doAction(Combatant self, Combatant target);
}
