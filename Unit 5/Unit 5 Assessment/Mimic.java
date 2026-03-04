public class Mimic extends Monster {
    
    public Mimic(String name, int health, int attack, int defense, int speed) {
        super(name, ElementType.EARTH, health, attack, defense, speed, 
            "Big Chomp", "Spew Potion", ElementType.EARTH, ElementType.FIRE);
    }

    public String victoryNoise() {
        return "GURGLE GURGLE!!!";
    }

}
