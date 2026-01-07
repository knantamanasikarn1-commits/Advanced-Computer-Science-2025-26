public class Unit3ExercisesTester {
    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // testReverseString();
        // testFindMaxValue();
        // testIsPalindrome();
        // testSumEvenNumbers();
        // testCalculateSumOfSquares();
        // testGetNthFibonacci();
        // testSortArrayDescending();
        // testFindLongestWord();
        testCalculateInterest();
    }

    // #1
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element rray
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
        // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    // #2
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

    // #3
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

    // #4
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

    // #5
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

    // #6
    public static void testCalculateSumOfSquares() {
        // Test Case - Main Case (integer array)
        int[] testArray = {1, 2, 3, -2};
        System.out.println("Expected 18: " + Unit3Exercises.calculateSumOfSquares(testArray));

        // Test Case - Edge Case (null array)
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(testArray));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    // #7
    public static void testGetNthFibonacci() {
        // Test Case - Main Case (positive int)
        int test = 10;
        System.out.println("Expected 55: " + Unit3Exercises.getNthFibonacci(test));

        // Test Case - Edge Case (negative/0 int)
        try {
            test = -4;
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(test));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the int was negative/0, as intended");
        }
    }

    // HELPER METHOD FOR ARRAY PRINTING
    public static String getIntArrayString(int[] arr) {
        String returnedString = "[";
        for (int i = 0; i < arr.length; i++) {
            returnedString += arr[i] + "";
            if (i == arr.length - 1) {
                returnedString += "]";
                continue;
            }
            returnedString += ", ";
        }
        return returnedString;
    }

    // #8
    public static void testSortArrayDescending() {
        // Test Case - Main Case (unsorted array)
        int[] testArray = {5, 2, 7, 1, 3};
        Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [7, 5, 3, 2, 1]: " + getIntArrayString(testArray));

        // Test Case - Main Case (unsorted array + negative ints)
        testArray = new int[] {-3, -6, 7, 3, 0, -9};
        Unit3Exercises.sortArrayDescending(testArray);
        System.out.println("Expected [7, 3, 0, -3, -6, -9]: " + getIntArrayString(testArray));

        // Test Case - Edge Case (null array)
        try {
            testArray = null;
            Unit3Exercises.sortArrayDescending(testArray);
            System.out.println("Expected exception");
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }

    // #9
    public static void testFindLongestWord() {
        // Test Case - Main Case (sentence with distinct longest length)
        String test = "pack my box with five dozen liquor jugs";
        System.out.println("Expected 'liquor': " + Unit3Exercises.findLongestWord(test));

        // Test Case - Main Case (sentence w/ nondistinct longest length)
        test = "the quick brown fox jumps over the lazy dog";
        System.out.println("Expected 'quick': " + Unit3Exercises.findLongestWord(test));

        // Test Case - Edge Case (null sentence)
        try {
            test = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(test));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the sentence was null, as intended");
        }
    }

    // #10
    public static void testCalculateInterest() {
        // Test Case - Main Case (Test 1, appropriate inputs)
        double principal = 1000.0;
        double rate = 12.5;
        int years = 2;
        System.out.println("Expected 1265.625: " + Unit3Exercises.calculateInterest(principal, rate, years));

        // Test Case - Main Case (Test 2, appropriate inputs)
        principal = 1000.0;
        rate = 10.0;
        years = 5;
        System.out.println("Expected 1610.51: " + Unit3Exercises.calculateInterest(principal, rate, years));

        // Test Case - Edge Case (negative principal)
        try {
            principal = -1000.0;
            rate = 12.5;
            years = 2;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when principal was negative, as intended");
        }

        // Test Case - Edge Case (negative rate)
        try {
            principal = 1000.0;
            rate = -12.5;
            years = 2;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when rate was negative, as intended");
        }

        // Test Case - Edge Case (negative/0 years)
        try {
            principal = 1000.0;
            rate = 12.5;
            years = 0;
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when years was non-positive, as intended");
        }
    }

}
