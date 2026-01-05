public class Unit3ExercisesTester {
    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // testReverseString();
        // testFindMaxValue();
        // testIsPalindrome();
        testSumEvenNumbers();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element rray
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge CAse: Null array
        try {
            letters = null;
        // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
         // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

         // Test Case - Edge Case: Null string
        try{
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

    }

    public static void testFindMaxValue() {
        // Test Case - Main Case (+ ints only)
        int[] testArray = {1, 2, 4, 3, 9};
        System.out.println("Expected 9: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case (- ints and 0)
        testArray = new int[] {0, -1, 0, 7, -100};
        System.out.println("Expected 7: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case (- ints only)
        testArray = new int[] {-5, -1, -4, -7, -100};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(testArray));

        // Test Case - Edge Case (null array)
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case (actual palindrome)
        String testString = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Main Case (not palindrome)
        testString = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Edge Case (null String)
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the str was null, as intended");
        }

        // Test Case - Edge Case (empty String)
        testString = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case (+ even and odd nums)
        int[] testArray = {1, 4, 8, 2, 7};
        System.out.println("Expected 14: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Edge Case (- even and odd ints only)
        testArray = new int[] {-2, -6, -5, -8, -9};
        System.out.println("Expected -16: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Edge Case (+ and - even and odd ints)
        testArray = new int[] {1, 4, -8, 2, -7, 3};
        System.out.println("Expected -2: " + Unit3Exercises.sumEvenNumbers(testArray));

        // Test Case - Edge Case (null Array)
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(testArray));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

}
