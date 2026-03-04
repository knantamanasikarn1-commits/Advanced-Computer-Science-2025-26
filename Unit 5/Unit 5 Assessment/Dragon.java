public class Dragon extends Monster {
    
    public Dragon(String name, int health, int attack, int defense, int speed) {
        super(name, ElementType.FIRE, health, attack, defense, speed, 
            "Blast Breath", "Dragon Twister", ElementType.FIRE, ElementType.AIR);
    }

    public String victoryNoise() {
        return "RRRRRAAAAAAA!!!";
    }

}
