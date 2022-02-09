package com.turn_based_game;

import com.turn_based_game.actions.Action;
import com.turn_based_game.actions.BasicAttack;

import java.util.Scanner;

public class BattleManager {
    int currentTurn = 0; //0 = players turn, 1 = enemy turn
    int turnCount = 0;

    Scanner scanner = new Scanner(System.in);

    Action[] actions = new Action[]{new BasicAttack()};

    Combatant combatantA = new Player("programmer", 10, 1, actions);
    Combatant combatantB = new Enemy("Bug", 10, 1, actions);

    public void Run() {
        System.out.println("\nBattle has started!\n");

        while (true) {
            turnCount++;
            Combatant currentCombatant = currentTurn == 0 ? combatantA : combatantB;
            Combatant otherCombatant = currentTurn == 0 ? combatantB : combatantA;

            //prompt currentCombatant for an action
            Action action = currentCombatant.PromptAction();

            //run currentCombatant action
            System.out.println(currentCombatant.getName() + " uses " + action.getName());
            action.doAction(currentCombatant, otherCombatant);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }


            String battleStatus = String.format("%n %s %s/%s     |     %s %s/%s %n",
                    combatantA.getName(), combatantA.getCurrentHealth(), combatantA.getMaxHealth(),
                    combatantB.getName(), combatantB.getCurrentHealth(), combatantB.getMaxHealth());
            System.out.println(battleStatus);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }

            //check for victory
            int comA = combatantA.getCurrentHealth();
            int comB = combatantB.getCurrentHealth();
            if (comA <= 0 || comB <= 0) {
                if (comA <= 0 && comB <= 0) {
                    System.out.println("It's a tie, they both defeated eachother at the same time.");
                } else if (comB <= 0) {
                    System.out.println(combatantA.getName() + " Is the winner!");
                } else if (comA <= 0) {
                    System.out.println(combatantB.getName() + " Is the winner!");
                }
                break;
            }

            //swap turns
            currentTurn = currentTurn == 0 ? 1 : 0;
        }

        System.out.println("\nBattle has finished!\n");
    }
}
