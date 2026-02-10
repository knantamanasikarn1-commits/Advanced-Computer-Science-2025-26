public abstract class Animal {

    private int age;
    private int averageLifespan;
    private int conservationStatus;
    private String species;
    private String name;
    private String methodOfMovement;
    private String habitat;

    public Animal() {

    }

    public Animal(int age, int averageLifespan, int conservationStatus, String species, String name,
            String methodOfMovement, String habitat) {
        this.age = age;
        this.averageLifespan = averageLifespan;
        this.conservationStatus = conservationStatus;
        this.species = species;
        this.name = name;
        this.methodOfMovement = methodOfMovement;
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(int conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethodOfMovement() {
        return methodOfMovement;
    }

    public void setMethodOfMovement(String methodOfMovement) {
        this.methodOfMovement = methodOfMovement;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void celebrateBirthday() {
        age++;
        conservationStatus--;
        System.out.println("It's your Birthday");
    }

    public void die() {
        age = 0;
        species = null;
        name = null;
        conservationStatus--;
    }

    public void getInAFight() {
        double chance = Math.random();
        this.attack();
        if (chance >= 0.5) {
            this.die();
        }
    }

    abstract void makeSound();

    abstract void attack();

}
