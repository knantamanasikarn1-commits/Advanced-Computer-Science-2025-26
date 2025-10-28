public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        String returnedString = "Currently, " + cat.getName() + " ";
        if (7 <= cat.getMoodLevel() && cat.getMoodLevel() <= 10) {
            returnedString += "is in a great mood."
                                + "\nPetting is appreciated.";
            return returnedString;
        }
        if (3 <= cat.getMoodLevel() && cat.getMoodLevel() <= 7) {
            returnedString += "is reminiscing of a past life."
                                + "\nPetting is acceptable.";
            return returnedString;
        }
        returnedString += "is plotting revengeance."
                            + "\nPetting is extremely risky.";
        return returnedString;
    }

    public static char generateCatChar(String catId) {
        int sumDigits = 0;
        for (int i = 0; i < catId.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(catId.charAt(i)));
            sumDigits += digit;
        }
        char catChar = (char) (sumDigits % 26 + 'A');
        return catChar;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int) (Math.random() * (high - low) + low);
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel > 10) {
            return 10;
        }
        if (moodLevel < 0) {
            return 0;
        }
        return moodLevel;
    }
    
    public static String validateCatId(String catId) {
        Integer number = Integer.parseInt(catId);
        if (1000 <= number && number <= 9999) {
            return number.toString();
        }
        return Integer.toString(generateRandomNumber(1000, 10000));
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else {
            if (cat.isHungry()) {
                cat.setMoodLevel(cat.getMoodLevel() - 1);
                System.out.println("Petting failed...");
            } else {
                cat.setMoodLevel(cat.getMoodLevel() + 1);
                System.out.println("Petting successful!");
            }
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int decrement = generateRandomNumber(1, 3);
        cat.setMoodLevel(cat.getMoodLevel() - decrement);
        if (decrement == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        String message = "Cleaning the litter box...\nDone!\n"
                            + cat.getName() + " appreciated that.";
        System.out.println(message);
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        String message = "Filling up " + cat.getName() + "'s bowl..."
                            + "\nDone!\n" + cat.getName() + " is eating...\n"
                            + cat.getName() + " is full!";
        System.out.println(message);
    }

}
