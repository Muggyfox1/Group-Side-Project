package com.turn_based_game.actions;

import com.turn_based_game.effects.Effects;

import java.util.ArrayList;
import java.util.List;

public class Action {
    String name;
    int accuracy;
    List<Effects> effects = new ArrayList<>();
}
