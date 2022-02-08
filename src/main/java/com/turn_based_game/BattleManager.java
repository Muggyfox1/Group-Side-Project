package com.turn_based_game;

import java.util.Scanner;

public class BattleManager {
    int currentTurn = 0; //0 = players turn, 1 = enemy turn
    int turnCount = 0;

    Scanner scanner = new Scanner(System.in);

    Combatant combatantA = new Player();
    Combatant combatantB = new Enemy();

    public void Run(){
        System.out.println("\nBattle has started!\n");

        while(true){
            turnCount++;
            Combatant currentCombatant = currentTurn == 0 ? combatantA : combatantB;
            Combatant otherCombatant = currentTurn == 0 ? combatantB : combatantA;

            //prompt currentCombatant for an action

            //run currentCombatant action

            //swap turns
            currentTurn = currentTurn == 0 ? 1 : 0;


            break;
        }

        System.out.println("\nBattle has finished!\n");
    }
}
