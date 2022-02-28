package com.turn_based_game;

import com.turn_based_game.actions.Action;
import com.turn_based_game.actions.BasicAttack;

import java.util.Scanner;

public class BattleManager {
    int currentTurn = 0; //0 = players turn, 1 = enemy turn
    int turnCount = 0;

    Scanner scanner = new Scanner(System.in);

    Action[] actions = new Action[]{new BasicAttack()};

    Combatant combatantA = new Player("programmer",10,1,actions);
    Combatant combatantB = new Enemy("programmer",10,1,actions);

    public void Run(){
        System.out.println("\nBattle has started!\n");

        while(true){
            turnCount++;
            Combatant currentCombatant = currentTurn == 0 ? combatantA : combatantB;
            Combatant otherCombatant = currentTurn == 0 ? combatantB : combatantA;

            //Print Battle Status
            //TODO: Insert printBattleStatus(); here

            //prompt currentCombatant for an action
            //TODO: Action action = currentCombatant.promptForAction()
            //TODO: Insert printActionUsed(); here

            //run currentCombatant action
            //TODO: action.doAction(currentCombatant, otherCombatant);

            //Check for victory
//            Boolean endBattle;//TODO: Insert = isBattleOver();
//            if(endBattle){
//                break;
//            }

            //swap turns
            currentTurn = currentTurn == 0 ? 1 : 0;

            break;//TODO: remove when done with "isBattleOver()"
        }

        //TODO: write out victory text
        System.out.println("\nBattle has finished!\n");
    }
}
