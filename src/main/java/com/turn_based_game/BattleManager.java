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

            //prompt currentCombatant for an action
            //Action action = currentCombatant.promptforaction()

            //run currentCombatant action
            //action.doAction(currentCombatant, otherCombatant);

            //swap turns
            currentTurn = currentTurn == 0 ? 1 : 0;


            break;
        }

        System.out.println("\nBattle has finished!\n");
    }
}
