public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Yamper", "Sonia", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Growlithe", "Jenny", 7, 693);

        for (Dog dog : new Dog[] {dog1, dog2, dog3}) {

            // Testing getters
            System.out.println(dog);
            System.out.println("Name: " + dog.getName());
            System.out.println("Owner Name: " + dog.getOwnerName());
            System.out.println("Age: " + dog.getAge());
            System.out.println("Dog ID: " + dog.getDogId());
            System.out.println("Dog Char: " + dog.getDogChar());
            System.out.println("Dog Tag: " + dog.getDogTag());
            System.out.println("Still in Facility?: " + dog.isStillInFacility());
            System.out.println();

            // Testing setters
            dog.setAge(dog.getAge() + 1);
            dog.setName("The Cooler " + dog.getName());
            System.out.println(dog);
            System.out.println();

        }

        // Testing generateDogChar() w/ Yamper (dogId 123)
        System.out.println("ID 123 char: " + dog1.generateDogChar());
        System.out.println();

        // Testing generateDogChar() w/ Growlithe (dogId 693)
        System.out.println("ID 693 char: " + dog3.generateDogChar());
        System.out.println();

        // Testing generateDogTag()
        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog3.generateDogTag());
        System.out.println();

        // Testing toString()
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println();

        // Testing equals
        System.out.println("Are dog1 and dog2 the same?: " + dog1.equals(dog2));
        Dog dog1Copy = new Dog("The Cooler Yamper", "Sonia", 6, 123);
        System.out.println("Are dog1 and dog1Copy the same?: " + dog1.equals(dog1Copy));
        System.out.println();

        // Testing stillInFacility
        dog1.setStillInFacility(false);
        System.out.println(dog1);

    }

}
