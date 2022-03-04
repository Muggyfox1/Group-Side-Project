package com.turn_based_game;

import com.turn_based_game.actions.Action;
import com.turn_based_game.actions.BasicAttack;
import com.turn_based_game.utility.General;

import java.util.Scanner;

public class BattleManager {
    Battle battle;
    int currentTurn = 0; //0 = players turn, 1 = enemy turn
    int turnCount = 0;

    public void Run(){
        System.out.println("\nBattle has started!\n");

        while(true){
            turnCount++;
            //assign current combatant
//            Combatant currentCombatant = currentTurn == 0 ? combatantA : combatantB;
//            Combatant otherCombatant = currentTurn == 0 ? combatantB : combatantA;

            //Print Battle Status
            //TODO: Insert printBattleStatus(); here

            //prompt currentCombatant for an action
            //TODO: Action action = currentCombatant.promptForAction()
            //TODO: Insert printActionUsed(); here

            //run currentCombatant action
            //TODO: action.execute(currentCombatant, otherCombatant);

            //Check for victory
            if(isBattleOver()){
                break;
            }

            //swap turns
            currentTurn = currentTurn == 0 ? 1 : 0;

            //this delay is only here for the CLI, needs to be moved to
            General.delay(1);

//            String battleStatus = String.format("%n %s %s/%s     |     %s %s/%s %n",
//                    combatantA.getName(), combatantA.getCurrentHealth(), combatantA.getMaxHealth(),
//                    combatantB.getName(), combatantB.getCurrentHealth(), combatantB.getMaxHealth());
//            System.out.println(battleStatus);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Thread was interrupted.");
//            }
//
//            //check for victory
//            int comA = combatantA.getCurrentHealth();
//            int comB = combatantB.getCurrentHealth();
//            if (comA <= 0 || comB <= 0) {
//                if (comA <= 0 && comB <= 0) {
//                    System.out.println("It's a tie, they both defeated eachother at the same time.");
//                } else if (comB <= 0) {
//                    System.out.println(combatantA.getName() + " Is the winner!");
//                } else if (comA <= 0) {
//                    System.out.println(combatantB.getName() + " Is the winner!");
//                }
//                break;
//            }
//
//            //swap turns
//            currentTurn = currentTurn == 0 ? 1 : 0;
        }

        //TODO: write out victory text
        System.out.println("\nBattle has finished!\n");
    }

    public Boolean isBattleOver(){
        return false;
    }
}
