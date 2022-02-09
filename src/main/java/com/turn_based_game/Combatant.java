package com.turn_based_game;

import com.turn_based_game.actions.Action;

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


    //getters

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public List<Action> getActionsAvailable() {
        return actionsAvailable;
    }

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
    public void increaseHealth(int hp) {
        this.currentHealth += hp;
    }

    public void decreaseHealth(int hp) {
        this.currentHealth -= hp;
    }

    public void increaseDefense(int amount) {}

    public void decreaseDefense(int amount) {}

    public abstract Action PromptAction();

    public void doAction(Action actionToDo) {}
}
