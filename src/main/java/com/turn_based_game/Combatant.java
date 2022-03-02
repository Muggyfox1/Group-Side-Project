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
    private List<Action> actions;

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
        return false;
    }

    // Constructors
    public Combatant(String name, int maxHealth, int maxDefence, Action[] actions) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.maxDefence = maxDefence;
        this.currentDefence = maxDefence;
        this.actions = Arrays.asList(actions);
    }

    // Behaviors
    public void increaseHealth(int amount) {
        currentHealth += amount;
        if(currentHealth > maxHealth){
            currentHealth = maxHealth;
        }
    }

    public void decreaseHealth(int amount) {
        currentHealth -= amount;
    }

    public void increaseDefense(int amount) {
        currentDefence += amount;
        if(currentDefence > maxDefence){
            currentDefence = maxDefence;
        }
    }

    public void decreaseDefense(int amount) {
        currentDefence -= amount;
        if(currentDefence < 0){
            currentDefence = 0;
        }
    }

    public void addAction(Action newAction) {
        actions.add(newAction);
    }

    public void removeAction(Action actionToDelete) {
        actions.remove(actionToDelete);
    }
}
