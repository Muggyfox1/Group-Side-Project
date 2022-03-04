package com.turn_based_game;

import com.turn_based_game.actions.Action;
import com.turn_based_game.model.Battle;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class BattleManager {
    // Instance variables
    private Battle battle;
    private int currentTurn = 0;
    private int turnCount = 0;
    private InputStream in;
    private OutputStream out;

    // Constructors
    public BattleManager(Battle battle, InputStream in, OutputStream out){
        this.battle = battle;
        this.in = in;
        this.out = out;
    }

    // Behaviors
    public void Run(){
        System.out.println("\nBattle has started!\n");

        while(true){
            turnCount++;
            //assign current combatant
            Combatant currentCombatant = battle.getNextCombatant();

            //Print Battle Status
            //TODO: Insert getBattleStatus(); here

            //String battleStatus = String.format("%n %s %s/%s     |     %s %s/%s %n",
//                    combatantA.getName(), combatantA.getCurrentHealth(), combatantA.getMaxHealth(),
//                    combatantB.getName(), combatantB.getCurrentHealth(), combatantB.getMaxHealth());
//            System.out.println(battleStatus);

            //prompt currentCombatant for an action
            Action action = currentCombatant.promptForAction();

            //TODO: create something like printActionUsed(); here

            //run currentCombatant action
            //TODO: action.execute(currentCombatant, otherCombatant);

            //check for victory
            if(battle.isBattleOver()) {
                Combatant winner = battle.getWinner();
                break;
            }

            //Rotate turn
            currentTurn++;
            if(currentTurn >= battle.getCombatants().size()){
                currentTurn = 0;
            }
        }

        //TODO: write out victory text
        System.out.println("\nBattle has finished!\n");
    }
}
