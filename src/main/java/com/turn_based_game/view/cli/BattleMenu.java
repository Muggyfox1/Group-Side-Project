package com.turn_based_game.view.cli;

import com.turn_based_game.model.Battle;
import com.turn_based_game.model.Combatant;
import com.turn_based_game.model.actions.Action;

public class BattleMenu {
    private Battle battle;
    private int currentTurn = 0;
    private int turnCount = 0;


    public void Open() {
        System.out.println("\nBattle has started!\n");

        while (true) {
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
            if (battle.isBattleOver()) {
                Combatant winner = battle.getWinner();
                break;
            }
            //Rotate turn
        }

        //TODO: write out victory text
        System.out.println("\nBattle has finished!\n");
    }
}
