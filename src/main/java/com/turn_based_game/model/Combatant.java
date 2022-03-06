package com.turn_based_game.model;

import com.turn_based_game.model.actions.Action;

import java.util.Arrays;
import java.util.List;

//TODO: refactor this to not be abstract
public abstract class Combatant {

    // Instance Variables
    //TODO: implement team property
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int maxDefence;
    private int currentDefence;
    private List<Action> actions;
    private boolean isPlayer;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxDefence() {
        return maxDefence;
    }

    public int getCurrentDefence() {
        return currentDefence;
    }

    public List<Action> getActions() {
        return actions;
    }

    public boolean isDefeated() {
        return currentHealth <= 0;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    // Constructors
    public Combatant(String name, int maxHealth, int maxDefence, Action[] actions, Boolean isPlayer) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.maxDefence = maxDefence;
        this.currentDefence = maxDefence;
        this.actions = Arrays.asList(actions);
        this.isPlayer = isPlayer;
    }

    // Behaviors
    public void increaseHealth(int amount) {
        currentHealth += Math.abs(amount);
        if(currentHealth > maxHealth){
            currentHealth = maxHealth;
        }
    }

    public void decreaseHealth(int amount) {
        currentHealth -= Math.abs(amount);
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void increaseDefense(int amount) {
        currentDefence += Math.abs(amount);
        if (currentDefence > maxDefence){
            currentDefence = maxDefence;
        }
    }

    public void decreaseDefense(int amount) {
        currentDefence -= Math.abs(amount);
        if (currentDefence < 0) {
            currentDefence = 0;
        }
    }

    public void addAction(Action newAction) {
        actions.add(newAction);
    }

    public void removeAction(Action actionToDelete) {
        actions.remove(actionToDelete);
    }

    @Deprecated
    public abstract Action promptForAction();
}
