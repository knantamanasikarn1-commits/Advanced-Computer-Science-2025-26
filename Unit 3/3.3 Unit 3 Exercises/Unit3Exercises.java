public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
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

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        String reversed = "";

        // Should actually go to i = 0, so >= instead of >
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            // Delete this, should not repeat char if index is div by 3???
        }
        // Delete this, do not need spaces if even length
        return reversed;
    }

    // Finds largest int in an int[]
    public static int findMaxValue(int[] numbers) {
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

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
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

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
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

}