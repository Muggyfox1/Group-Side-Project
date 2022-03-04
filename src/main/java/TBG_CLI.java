import com.turn_based_game.BattleManager;
import com.turn_based_game.Combatant;
import com.turn_based_game.Enemy;
import com.turn_based_game.Player;
import com.turn_based_game.actions.Action;
import com.turn_based_game.actions.BasicAttack;
import com.turn_based_game.model.Battle;

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
        BattleManager battleManager = new BattleManager(battle, System.in, System.out);
        battleManager.Run();
    }

}
