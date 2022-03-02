package com.turn_based_game.actions;

import com.turn_based_game.Combatant;

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
    public String getName() {
        return name;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public int getPower() {
        return power;
    }

    // Behaviors
    public abstract void doAction(Combatant self, Combatant target);
}
