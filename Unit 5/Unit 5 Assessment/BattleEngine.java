// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

// import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster was null.");
        }
        if (monster.attack < 0) {
            return false;
        }
        if (monster.defense < 0) {
            return false;
        }
        if (monster.health < 0) {
            return false;
        }
        if (monster.speed < 0) {
            return false;
        }
        return (monster.getTotalStatSum() <= 250);
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster was null.");
        }
        if (monster.element == ElementType.FIRE || monster.element == ElementType.WATER || 
            monster.element == ElementType.EARTH || monster.element == ElementType.AIR) {
                return true;
            }
        monster.element = ElementType.FIRE;
        return false;
    }

    public static boolean isValid(Monster monster) {
        if (!validateElement(monster)) {
            return false;
        }
        if (!validateStats(monster)) {
            correctStats(monster);
            return false;
        }
        return true;
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster was null.");
        }
        if (validateStats(monster)) {
            return;
        }
        monster.attack = 60;
        monster.defense = 60;
        monster.health = 60;
        monster.speed = 60;
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("Monsters are null");
        }
        if (!isValid(monster1) && !isValid(monster2))
            return null;
        if (!isValid(monster1)) {
            System.out.println(monster2.name + " wins by default!");
            return monster2;
        }
        if (!isValid(monster2)) {
            System.out.println(monster1.name + " wins by default!");
            return monster1;
        }
        System.out.println(monster1.name + " wants to fight!");
        System.out.println(monster2.name + " wants to fight!");
        displayStatus(monster1, monster2);
        boolean isTurnMonster1;
        if (monster1.speed == monster2.speed) {
            double chance = Math.random();
            isTurnMonster1 = (chance < 0.5);
        } else {
            isTurnMonster1 = (monster1.speed > monster2.speed);
        }
        while (monster1.health > 0 && monster2.health > 0) {
            if (isTurnMonster1) {
                monster1.attack(monster2);
            } else {
                monster2.attack(monster1);
            }
            displayStatus(monster1, monster2);
            isTurnMonster1 = !isTurnMonster1;
        }
        if (monster1.health <= 0) {
            System.out.println(monster2.victoryNoise());
            return monster2;
        } else {
            System.out.println(monster1.victoryNoise());
            return monster1;
        }
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster was null.");
        }
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent monster was null.");
        }
        String status = monster.name + ": " + monster.health + " HP || "
            + opponent.name + ": " + opponent.health + " HP";
        System.out.println(status);
    }

}
