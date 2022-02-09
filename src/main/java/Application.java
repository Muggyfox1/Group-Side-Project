import com.turn_based_game.BattleManager;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        BattleManager battle = new BattleManager();

        battle.Run();
    }
}
