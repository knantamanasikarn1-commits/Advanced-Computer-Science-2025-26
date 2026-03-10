public class Leviathan extends Monster {
    
    public Leviathan(String name, int health, int attack, int defense, int speed) {
        super(name, ElementType.WATER, health, attack, defense, speed, 
            "Tsunami", "Dragon Tail", ElementType.WATER, ElementType.AIR);
    }

    public String victoryNoise() {
        return "FUSHAAAAAA!!!";
    }

}
