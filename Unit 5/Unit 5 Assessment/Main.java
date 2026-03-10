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
        Leviathan leviathan = new Leviathan("Levi", 100, 70, 50, 30);
        list.add(mimic);
        list.add(dragon);
        list.add(leviathan);
        return list;
    }

    public static void main(String[] args) {

        // Run a tournament using monsters from getMonstersForTest():
        ArrayList<Monster> monsters = getMonstersForTest();
        Monster winner = BattleEngine.startBattle(monsters.get(1), monsters.get(2));
        System.out.println("Winner: " + (winner != null ? winner.getName() : "None"));
        
    }
}
