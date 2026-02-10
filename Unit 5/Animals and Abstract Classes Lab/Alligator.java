public class Alligator extends Animal {

    private double height; // feet
    private String color;

    public Alligator() {
        super(0, 40, 1, "Alligator mississippiensis", "Carlos", "swimming", "freshwater wetlands");
        this.height = 1.0;
        this.color = "green";
    }

    public Alligator(int age, double height, String species, String color, String habitat,
            int conservationStatus, int averageLifespan, String primaryMovementMethod) {
        super(age, averageLifespan, conservationStatus, species, "Carlos", primaryMovementMethod, habitat);
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "This is " + super.getSpecies() + ", a species of alligator that lives in " + super.getHabitat() + ". "
            + "It is " + height + " feet tall, moves by " + super.getMethodOfMovement()+ ", and is " + color + ". "
            + "It has a conservation status of " + super.getConservationStatus() + "/10 and on average, "
            + "lives for " + super.getAverageLifespan() + " years.";
    }

    public void lurkInWater() {
        System.out.println("The alligator hides in the water...");
    }

    public void makeSound() {

    }

    public void attack() {
        
    }

}
