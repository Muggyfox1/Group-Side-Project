package com.turn_based_game.model;

import java.util.List;

public class Battle {
    // Instance Variables
    private List<Combatant> combatants;
    private int currentTurn = 0;

    // Constructors
    public Battle(List<Combatant> combatants){
        this.combatants = combatants;
    }

    // Getters and Setters
    public List<Combatant> getCombatants() {
        return combatants;
    }

    //TODO: implement this.
    public String getBattleStatus(){
        //String battleStatus = String.format("%n %s %s/%s     |     %s %s/%s %n",
//                    combatantA.getName(), combatantA.getCurrentHealth(), combatantA.getMaxHealth(),
//                    combatantB.getName(), combatantB.getCurrentHealth(), combatantB.getMaxHealth());
//            return battleStatus;
        return "";
    }

    //TODO: update this to handle groups of more than 2 Combatants.
    public Boolean isBattleOver(){
        int comA = combatants.get(0).getCurrentHealth();
        int comB = combatants.get(1).getCurrentHealth();
        if ( comA <= 0 || comB <= 0) {
            return true;
        }
        return false;
    }

    //TODO: implement this.
    //return null if no winner, otherwise return the winning combatant in battle.
    public Combatant getWinner(){
        return null;
    }

    public Combatant getNextCombatant(){
        return null;
    }

    // Behaviors


}
