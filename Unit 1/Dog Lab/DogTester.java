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

        // // Testing generateDogChar() w/ Yamper (dogId 123)
        // System.out.println("ID 123 char: " + dog1.generateDogChar());
        // System.out.println();

        // // Testing generateDogChar() w/ Growlithe (dogId 693)
        // System.out.println("ID 693 char: " + dog3.generateDogChar());
        // System.out.println();

        // // Testing generateDogTag()
        // System.out.println(dog1.generateDogTag());
        // System.out.println(dog2.generateDogTag());
        // System.out.println(dog3.generateDogTag());
        // System.out.println();

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
        System.out.println();

        // Testing static generateDogChar() method
        System.out.println(PawesomeUtils.generateDogChar(123)); // should return 'L'
        System.out.println(PawesomeUtils.generateDogChar(100)); // should return 'G'
        System.out.println(PawesomeUtils.generateDogChar(693)); // should return 'N'
        System.out.println();

        // Testing static pickup() method
        Dog dog4 = new Dog("Fidough", "Kai", 4, 500);
        System.out.println(PawesomeUtils.pickup(dog4, "Ken"));
        System.out.println(PawesomeUtils.pickup(dog4, "Kai"));
        System.out.println(dog4.isStillInFacility());
        System.out.println();

        // Testing static checkIn() method
        System.out.println("Is dog1 still in facility?: " + dog1.isStillInFacility());
        PawesomeUtils.checkIn(dog1, "NewOwner");
        System.out.println("Is dog1 still in facility?: " + dog1.isStillInFacility());
        System.out.println(dog1.getOwnerName());
        System.out.println();

        // Test validateDogId() method
        Dog invalidIdDog = new Dog("Bug", "Death", 666, 9999);
        Dog validIdDog = new Dog("Goodest Boy", "Good Guy", 7, 111);
        System.out.println(PawesomeUtils.validateDogId(invalidIdDog.getDogId())); // gets random
        System.out.println(PawesomeUtils.validateDogId(validIdDog.getDogId())); // still 111
        System.out.println();

        // Test validateDogTag() method
        Dog dogA = new Dog("Another One", "I dunno", 12, 130);
        System.out.println(PawesomeUtils.validateDogTag(dogA));
        System.out.println(PawesomeUtils.validateDogTag(invalidIdDog));
        System.out.println(PawesomeUtils.validateDogTag(validIdDog));
        System.out.println();

        // Test edge cases of validateDogTag()
        validIdDog.setDogId(1000);
        System.out.println(PawesomeUtils.validateDogTag(validIdDog));

    }

}
