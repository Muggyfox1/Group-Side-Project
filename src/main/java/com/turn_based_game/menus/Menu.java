package com.turn_based_game.menus;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class Menu {
    InputStream in;
    OutputStream out;

    public Menu(InputStream in, OutputStream out){
        this.in = in;
        this.out = out;
    }
}
