import java.util.ArrayList;

public class Main {

    /**
     * Return an ArrayList of monsters for automated testing.
     * Populate this with your created monsters (e.g. Chimera, custom subclasses).
     */
    public static ArrayList<Monster> getMonstersForTest() {

        ArrayList<Monster> list = new ArrayList<>();
        Mimic mimic = new Mimic("Cartouche", 80, 60, 70, 30);
        Dragon dragon = new Dragon("Drampa", 70, 70, 30, 70);
        list.add(mimic);
        list.add(dragon);
        return list;
    }

    public static void main(String[] args) {

        // Run a tournament using monsters from getMonstersForTest():
        ArrayList<Monster> monsters = getMonstersForTest();
        Monster winner = BattleEngine.startBattle(monsters.get(0), monsters.get(1));
        System.out.println("Winner: " + (winner != null ? winner.getName() : "None"));
        
    }
}
