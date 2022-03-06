import com.turn_based_game.controller.BattleController;
import com.turn_based_game.model.*;
import com.turn_based_game.model.actions.Action;
import com.turn_based_game.model.actions.BasicAttack;

import java.util.ArrayList;
import java.util.List;

public class TBG_CLI {

    public static void main(String[] args) {
        List<Combatant> combatants = new ArrayList<>();

        Action[] actions = new Action[]{new BasicAttack()};
        Combatant player = new Player("Programmer", 10, 5, actions);
        Combatant bug = new Enemy("Syntax error", 5, 5, actions);

        combatants.add(player);
        combatants.add(bug);

        Battle battle = new Battle(combatants);
        BattleController battleController = new BattleController(battle, System.in, System.out);
        battleController.Run();
    }

}
