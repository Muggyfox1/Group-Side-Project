package com.turn_based_game.menus;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public abstract class Menu {

    // Instance Variables
    InputStream in;
    OutputStream out;
    List<String> options;

    // Getters and Setters
    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    // Constructors
    public Menu(InputStream in, OutputStream out){
        this.in = in;
        this.out = out;
    }

    public Menu(InputStream in, OutputStream out, List<String> options){
        this.in = in;
        this.out = out;
        this.options = options;
    }

    // Behaviors
    public abstract void Open();
}
