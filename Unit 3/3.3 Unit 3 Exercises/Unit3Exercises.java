public class Unit3Exercises {

    // #1
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        // Added exception
        if (strs == null) {
            throw new NullPointerException("INVALID (The String array is null)");
        }
        // Initial sum should be at 0
        int sum = 0;
        int numTerms = strs.length;
        // Initial index should be 0
        for (int i = 0; i < strs.length; i++) {
            // Insert null check and make sure that is not counted in num terms
            if (strs[i] == null) {
                numTerms -= 1;
                continue;
            }
            // Should check index i, not i - 1
            sum += strs[i].length();
            // Should not be subtracting 1 from sum if index is even???
        }
        // Average calculated by sum / num terms, and num terms is strs.length as defined above
        return sum / numTerms;
    }

    // #2
    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        // Added exception
        if (str == null) {
            throw new NullPointerException("INVALID (The String is null)");
        }
        String reversed = "";

        // Should actually go to i = 0, so >= instead of >
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            // Delete this, should not repeat char if index is div by 3???
        }
        // Delete this, do not need spaces if even length
        return reversed;
    }

    // #3
    // Finds largest int in an int[]
    public static int findMaxValue(int[] numbers) {
        // Added exception
        if (numbers == null) {
            throw new NullPointerException("INVALID (numbers Array is null)");
        }
        // Max should not be 0 (- nums), but start at first index
        int max = numbers[0];
        // Should change <= to < b/c no index of array length, max is one less
        // Starting at index 1 b/c index 0 is default max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { 
                // Should set to current index i, not i - 1
                max = numbers[i];
            }
        }
        return max;
    }

    // #4
    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        // Added exception
        if (str == null) {
            throw new NullPointerException("INVALID (str is null)");
        }
        int left = 0;
        int right = str.length() - 1;
        // What this while loop is doing is checking for str NOT being a palindrome
        while (left < right) {
            char a = str.charAt(left);
            // Take index right, not right - 1
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        // So, if NOT found to be NOT a palindrome, is palindrome
        return true;
    }

    // #5
    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        // Added exception
        if (numbers == null) {
            throw new NullPointerException("INVALID (numbers is null)");
        }
        int sum = 0;
        // Should go through all indices, not len - 1 (so just len)
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                // Just add current index i, not i + 1
                sum += numbers[i];
            }
            // Do not need to delete stuff if odd
        }
        // Do not need to set sum to array len???
        return sum;
    }

    // #6
    public static int calculateSumOfSquares(int[] numbers) {
        // Added exception
        if (numbers == null) {
            throw new NullPointerException("INVALID (numbers is null)");
        }
        int sum = 0;
        // Starting index is i = 0, not i = 1
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    // #7
    public static int getNthFibonacci(int n) {
        // Added exception
        if (n <= 0) {
            throw new IllegalArgumentException("INVALID (n was negative/0)");
        }
        // The second Fibonacci is also 1 (starts w/ 1, 1)
        if (n <= 2) {
            return 1;
        }

        // The initial (a, b) is (1, 1) not (0, 1)
        int a = 1, b = 1, c;
        // Should be up to n, not i <= n
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // #8
    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("INVALID (arr is null)");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Should be descending, not ascending, so change < to >
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // #9
    public static String findLongestWord(String sentence) {
        // Added exception
        if (sentence == null) {
            throw new IllegalArgumentException("INVALID (sentence is null)");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            // Since equal lengths keep first, change >= to >
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // #10
    public static double calculateInterest(double principal, double rate, int years) {
        // Added exceptions
        if (principal < 0) {
            throw new IllegalArgumentException("INVALID (principal is negative)");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("INVALID (rate is negative)");
        }
        if (years <= 0) {
            throw new IllegalArgumentException("INVALID (years is not positive)");
        }
        // Interestingly (pun intended), could do:
        // principal = principal * Math.pow((100 + rate) / 100, years);
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    // #11
    public static int parsePositiveInteger(String str) {
        // Added try-catch
        try {
            int number = Integer.parseInt(str);
            // Added negative exception
            if (number < 0) {
                throw new NumberFormatException("INVALID: the number evaluated to a negative");
            }
            return number; // Method should return 1 if it's negative
        } catch(Exception e) {
            // Added error printing and default value returning
            System.out.println(e.getMessage());
            return 1;
        }
    }

    // #12
    public static String getArrayElement(String[] arr, int index) {
        // Added try-catch
        try {
            return arr[index];
        } catch(Exception e) {
            // Add mesage and default return
            System.out.println(e.getMessage());
            System.out.println("The given index was out of bounds for the array");
            return null;
        }
    }

    // #13
    public static double calculateSquareRoot(int number) {
        // Added try-catch
        try {
            // Added negative exception
            if (number < 0) {
                throw new IllegalArgumentException("INVALID: a negative number cannot be rooted");
            }
            return Math.sqrt(number);
        } catch(Exception e) {
            // Print message and return defaults
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    // #14
    public static int sumArrayElements(int[] array) {
        // Added try-catch, error message, and default return
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    // #15
    public static double calculatePower(double base, int exponent) {
        // Added try-catch, error catching, exception message printing, default value returning
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("INVALID: this method cannot take in negative exponents");
            }
            return Math.pow(base, exponent);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }
    }

}