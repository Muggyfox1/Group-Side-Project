package com.turn_based_game;

import java.util.Arrays;
import java.util.List;

public abstract class Combatant {

    // Instance Variables
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int maxDefence;
    private int currentDefence;
    private List<Action> actionsAvailable;

    // Constructors
    public Combatant(String name, int maxHealth, int maxDefence, Action[] actionsAvailable) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.maxDefence = maxDefence;
        this.currentDefence = maxDefence;
        this.actionsAvailable = Arrays.asList(actionsAvailable);
    }

    // Behaviors
    public void increaseHealth(int hp) {}

    public void decreaseHealth(int hp) {}

    public void increaseDefense(int amount) {}

    public void decreaseDefense(int amount) {}

    public void doAction(Action actionToDo) {}
}
