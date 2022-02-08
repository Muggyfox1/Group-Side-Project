package com.turn_based_game;

import com.turn_based_game.actions.Action;

import java.util.List;

public class Combatant {

    // Instance Variables
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int maxDefence;
    private int currentDefence;
    private List<Action> availableActions;

    // Constructors


    // Getters and Setters

    // Behaviors
    public void increaseHealth(int hp) {}

    public void decreaseHealth(int hp) {}

    public void increaseDefense(int amount) {}

    public void decreaseDefense(int amount) {}

    public void doAction(Action actionToDo) {}
}
