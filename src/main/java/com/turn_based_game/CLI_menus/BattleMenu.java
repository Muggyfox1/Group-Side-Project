package com.turn_based_game.CLI_menus;

import com.turn_based_game.model.Battle;

import java.io.InputStream;
import java.io.OutputStream;

public class BattleMenu extends CLI_Menu {

    public BattleMenu(InputStream in, OutputStream out, Battle battle){
        super(in,out);
    }

    @Override
    public void Open() {

    }
}
