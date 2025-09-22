public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here
        
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 90.0;
        System.out.println("Initial temperature: " + temperature);
        boolean isCold = false;
        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println("isCold: " + isCold);
        System.out.println("New temperature: " + temperature);
        System.out.println();

        // Part 2: Grade Calculator
        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 96;
        System.out.println("Score: " + score);
        System.out.print("Result: ");
        if (score >= 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println();

        // Part 3: Season Determiner
        System.out.println("--- Part 3: Season Determiner ---");
        System.out.println("Temperature: " + temperature);
        System.out.print("Season: ");
        int temperature2 = 70;
        if (temperature2 > 80) {
            System.out.println("Summer");
        } else if (temperature2 >= 60) {
            System.out.println("Spring");
        } else if (temperature2 >= 40) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
        System.out.println();
        
        // Part 4: Number Classifier
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 2;
        System.out.println("Number: " + number);
        System.out.print("Classification: ");
        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
        if (number > 100) {
            System.out.print(", Large");
        } else if (number < -100) {
            System.out.print(", Very Negative");
        }
        System.out.println();
        
    }
        
}