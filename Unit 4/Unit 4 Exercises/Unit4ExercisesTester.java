public class Unit4ExercisesTester {
    public static void main(String[] args) {
        System.out.println();
        testMatchingEndSequences();
        testHasThreeConsecutive();
        testGenerateNumberSequence();
        testFizzBuzz();
        testMoveEvenBeforeOdd();
    }

    public static void testMatchingEndSequences() {
        System.out.println("MATCHING END SEQUENCES TEST:");
        int[] testArray = {5, 6, 45, 99, 13, 5, 6};
        System.out.print("Expected true: ");
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 0));
        System.out.print("Expected false: ");
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 1));
        System.out.print("Expected true: ");
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 2));
        System.out.print("Expected false: ");
        System.out.println(Unit4Exercises.matchingEndSequences(testArray, 3));
        System.out.println();
    }

    public static void testHasThreeConsecutive() {
        System.out.println("HAS THREE CONSECUTIVE TEST:");
        int[] testArray = new int[] {2, 1, 3, 5};
        System.out.print("Expected true: ");
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray));
        testArray = new int[] {2, 1, 2, 5};
        System.out.print("Expected false: ");
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray));
        testArray = new int[] {2, 4, 2, 5};
        System.out.print("Expected true: ");
        System.out.println(Unit4Exercises.hasThreeConsecutive(testArray));
        System.out.println();
    }

    private static String printArray(int[] array) {
        String returnedString = "[";
        for (int i = 0; i < array.length - 1; i++) {
            returnedString += array[i] + ", ";
        }
        returnedString += array[array.length - 1] + "]";
        return returnedString;
    }

    private static String printArray(String[] array) {
        String returnedString = "[";
        for (int i = 0; i < array.length - 1; i++) {
            returnedString += array[i] + ", ";
        }
        returnedString += array[array.length - 1] + "]";
        return returnedString;
    }

    public static void testGenerateNumberSequence() {
        System.out.println("GENERATE NUMBER SEQUENCE TEST:");
        int[] params = new int[] {5, 10};
        System.out.print("Expected [5, 6, 7, 8, 9]: ");
        System.out.println(printArray(Unit4Exercises.generateNumberSequence(params[0], params[1])));
        params = new int[] {11, 18};
        System.out.print("Expected [11, 12, 13, 14, 15, 16, 17]: ");
        System.out.println(printArray(Unit4Exercises.generateNumberSequence(params[0], params[1])));
        params = new int[] {1, 3};
        System.out.print("Expected [1, 2]: ");
        System.out.println(printArray(Unit4Exercises.generateNumberSequence(params[0], params[1])));
        System.out.println();
    }

    public static void testFizzBuzz() {
        System.out.println("FIZZ BUZZ TEST:");
        int[] params = new int[] {1, 6};
        System.out.print("Expected [1, 2, Fizz, 4, Buzz]: ");
        System.out.println(printArray(Unit4Exercises.fizzBuzz(params[0], params[1])));
        params = new int[] {1, 8};
        System.out.print("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7]: ");
        System.out.println(printArray(Unit4Exercises.fizzBuzz(params[0], params[1])));
        params = new int[] {1, 11};
        System.out.print("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]: ");
        System.out.println(printArray(Unit4Exercises.fizzBuzz(params[0], params[1])));
        System.out.println();
    }

    public static void testMoveEvenBeforeOdd() {
        System.out.println("MOVE EVEN BEFORE ODD TEST:");
        int[] testArray = new int[] {1, 0, 1, 0, 0, 1, 1};
        System.out.print("Expected [0, 0, 0, 1, 1, 1, 1]: ");
        System.out.println(printArray(Unit4Exercises.moveEvenBeforeOdd(testArray)));
        testArray = new int[] {3, 3, 2};
        System.out.print("Expected [2, 3, 3]: ");
        System.out.println(printArray(Unit4Exercises.moveEvenBeforeOdd(testArray)));
        testArray = new int[] {2, 2, 2};
        System.out.print("Expected [2, 2, 2]: ");
        System.out.println(printArray(Unit4Exercises.moveEvenBeforeOdd(testArray)));
    }

}
