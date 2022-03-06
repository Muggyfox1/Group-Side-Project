package com.turn_based_game.model;

public class Effect {
    private int id;
    private String name;
    private String property;
    private int amount;

    public Effect(int id, String name, String property, int amount){
        this.id = id;
        this.name = name;
        this.property = property;
        this.amount = amount;
    }
}
