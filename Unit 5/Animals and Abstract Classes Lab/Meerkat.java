public class Meerkat {
    private double height; // feet
    private double swimSpeed; // mph
    private String species;
    private String color;
    private String habitat;
    private String conservationStatus;
    private int averageLifespan;
    private String primaryMovementMethod;

    public Meerkat() {
        
    }

    public Meerkat(double height, double swimSpeed, String species, String color, String habitat,
            String conservationStatus, int averageLifespan, String primaryMovementMethod) {
        this.height = height;
        this.swimSpeed = swimSpeed;
        this.species = species;
        this.color = color;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
        this.averageLifespan = averageLifespan;
        this.primaryMovementMethod = primaryMovementMethod;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getPrimaryMovementMethod() {
        return primaryMovementMethod;
    }

    public void setPrimaryMovementMethod(String primaryMovementMethod) {
        this.primaryMovementMethod = primaryMovementMethod;
    }

    

}
