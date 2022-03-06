package com.turn_based_game.CLI_menus;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public abstract class CLI_Menu {

    // Instance Variables
    private InputStream in;
    private OutputStream out;

    // Getters and Setters

    // Constructors
    public CLI_Menu(InputStream in, OutputStream out){
        this.in = in;
        this.out = out;
    }

    // Behaviors
    public abstract void Open();

    protected int getIntFromUser(){
        return 0;
    }

    protected String getStringFromUser(){
        return null;
    }

    protected String getChoiceFromUser(String[] options){
        return null;
    }
}
