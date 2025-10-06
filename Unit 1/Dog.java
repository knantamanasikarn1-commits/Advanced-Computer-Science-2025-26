public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Doggo";
        this.ownerName = "Kai";
        this.age = 7;
        this.dogId = 100;
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        String stillInFacilityText = "";
        if (!stillInFacility) {
            stillInFacilityText = "not ";
        }
        String returnedString = name + " is a good dog. They are " + age + " years old and belong to "  + ownerName + ". " + 
                                "They are " + stillInFacilityText + "currently in our facility. " + 
                                "For employee use only: DogTag is " + dogTag + ".";
        return returnedString;
    }

    public boolean equals(Dog other) {
        return (this.name.equals(other.name) &&
                this.ownerName.equals(other.ownerName) &&
                this.age == other.age &&
                this.dogId == other.dogId &&
                this.dogChar == other.dogChar && 
                this.dogTag.equals(other.dogTag) &&
                this.stillInFacility == other.stillInFacility);
    }

    public String generateDogTag() {
        String returnedString = dogId + "" + dogChar;
        return returnedString;
    }

    public static char generateDogChar(int dogId) {
        int d1 = dogId % 10;
        int d2 = (dogId / 10) % 10;
        int d3 = ((dogId / 10) / 10) % 10;
        char returned_char = (char) ('F' + ((d1 + d2 + d3) % 10));
        return returned_char;
    }

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.ownerName)) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner" + personName + ".";
        }
        return personName + " cannot pick up " + dog.name + " because they are not " + dog.name + "'s owner.";
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }

}