public class PawesomeUtils {

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        }
        return personName + " cannot pick up " + dog.getName() + " because they are not " + dog.getName() + "'s owner.";
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println(dog.getName() + " was successfully checked in.");
        } else {
            System.out.println(dog.getName() + " was not checked in because of an invalid tag.");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String returnedString = "" + dogId + dogChar;
        return returnedString;
    }

    public static char generateDogChar(int dogId) {
        int d1 = dogId % 10;
        int d2 = (dogId / 10) % 10;
        int d3 = ((dogId / 10) / 10) % 10;
        char returnedChar = (char) ('F' + ((d1 + d2 + d3) % 10));
        return returnedChar;
    }

    public static int validateDogId(int dogId) {
        if (100 <= dogId && dogId <= 999) {
            return dogId;
        }
        return (int) (Math.random() * 900 + 100);
    }

    public static boolean validateDogTag(Dog dog) {
        int validatedDogId = validateDogId(dog.getDogId());
        char newChar = generateDogChar(validatedDogId);
        String newDogTag = "" + validatedDogId + newChar;
        return (newDogTag.equals(dog.getDogTag()));
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int dogAge = dog.getAge();
        int humanAge = 0;
        if (dogAge == 1) {
            humanAge = 15;
        } else if (dogAge >= 2) {
            humanAge = 24;
            humanAge += (dogAge - 2) * 5;
        }
        return humanAge;
    }

    public static int convertAgeToDogYears(int humanYears) {
        int dogAge = 0;
        if (humanYears <= 15) {
            dogAge = 1;
        } else if (15 < humanYears && humanYears <= 24) {
            dogAge = 2;
        } else if (humanYears > 24) {
            dogAge = (humanYears - 24) / 5 + 2;
        }
        return dogAge;
    }

}
