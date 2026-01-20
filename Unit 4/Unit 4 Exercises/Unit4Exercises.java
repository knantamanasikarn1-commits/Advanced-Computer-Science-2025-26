import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if ((nums[i] % 2 == 0) == (nums[i + 1] % 2 == 0) == (nums[i + 2] % 2 == 0)) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] newArray = new int[end - start];
        for (int i = start; i < end; i++) {
            newArray[i - start] = i;
        }
        return newArray;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] newArray = new String[end - start];
        for (int i = start; i < end; i++) {
            String newString = "";
            if (i % 3 == 0) {
                newString += "Fizz";
            }
            if (i % 5 == 0) {
                newString += "Buzz";
            }
            if (newString.equals("")) {
                newString = String.valueOf(i);
            }
            int index = i - start;
            newArray[index] = newString;
        }
        return newArray;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // int[] newArray = new int[nums.length];
        // int evenIndex = 0;
        // int oddIndex = nums.length - 1;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
        //         newArray[evenIndex] = nums[i];
        //         evenIndex++;
        //     } else {
        //         newArray[oddIndex] = nums[i];
        //         oddIndex--;
        //     }
        // }
        // return newArray;
        int[] newArray = new int[nums.length];
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                newArray[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return newArray;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
