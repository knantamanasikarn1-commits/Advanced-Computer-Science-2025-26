public class PawesomeUtils {

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        }
        return personName + " cannot pick up " + dog.getName() + " because they are not " + dog.getName() + "'s owner.";
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String returnedString = "" + dogId + dogChar;
        return returnedString;
    }

    public static char generateDogChar(int dogId) {
        int d1 = dogId % 10;
        int d2 = (dogId / 10) % 10;
        int d3 = ((dogId / 10) / 10) % 10;
        char returned_char = (char) ('F' + ((d1 + d2 + d3) % 10));
        return returned_char;
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

}
