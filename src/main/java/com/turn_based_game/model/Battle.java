package com.turn_based_game.model;

import com.turn_based_game.Combatant;

import java.util.List;

public class Battle {
    // Instance Variables
    private List<Combatant> combatants;

    // Constructors
    public Battle(List<Combatant> combatants){
        this.combatants = combatants;
    }

    // Getters and Setters
    public List<Combatant> getCombatants() {
        return combatants;
    }

    public String getBattleStatus(){
        String str = "";
        str = String.format("");
        return "";
    }

    // Behaviors

}
