public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            }
            return "10:00";
        }
        if (day == 0 || day == 6) {
            return "10:00";
        }
        return "7:00";
    }

    public static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        String returnedString = "";
        if (str.charAt(0) == 'f') {
            returnedString += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            returnedString += "Buzz";
        }
        return returnedString;
    }

    public static String doubleChar(String str) {
        String returnedString = "";
        for (int i = 0; i < str.length(); i++) {
            returnedString += str.charAt(i);
            returnedString += str.charAt(i);
        }
        return returnedString;

    }

    public static int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        int hiCount = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                hiCount += 1;
            }
        }
        return hiCount;
    }

    public static boolean catDog(String str) {
        if (str.length() <= 2) {
            return false;
        }
        int dogCount = 0;
        int catCount = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String currentCheck = str.substring(i, i + 3);
            if (currentCheck.equals("dog")) {
                dogCount += 1;
            }
            if (currentCheck.equals("cat")) {
                catCount += 1;
            }
        }
        return (dogCount == catCount);
    }

    public static String mixString(String a, String b) {
        String returnedString = "";
        boolean isALonger = (a.length() > b.length());
        int shorterLength;
        if (isALonger) {
            shorterLength = b.length();
        } else {
            shorterLength = a.length();
        }
        for (int i = 0; i < shorterLength; i++) {
            returnedString += a.charAt(i);
            returnedString += b.charAt(i);
        }
        if (isALonger) {
            returnedString += a.substring(shorterLength);
        } else {
            returnedString += b.substring(shorterLength);
        }
        return returnedString;

    }

    public static String repeatEnd(String str, int n) {
        String returnedString = "";
        String strToRepeat = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            returnedString += strToRepeat;
        }
        return returnedString;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            return (b.substring(b.length() - a.length()).equals(a));
        }
        return (a.substring(a.length() - b.length()).equals(b));
    }

    public static int countCode(String str) {
        if (str.length() <= 3) {
            return 0;
        }
        int codeCount = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                codeCount += 1;
            }
        }
        return codeCount;
    }

    public static int countEvens(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount += 1;
            }
        }
        return evenCount;
    }

    public static int bigDiff(int[] nums) {
        int currentMin = nums[0];
        int currentMax = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            currentMin = Math.min(nums[i], nums[i + 1]);
            currentMax = Math.max(nums[i], nums[i + 1]);
        }
        return currentMax - currentMin;
    }

    public static int sum13(int[] nums) {
        if (nums == null) {
            return 0;
        }
        boolean voidNext = false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (voidNext) {
                continue;
            }
            if (nums[i] == 13) {
                voidNext = true;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] returnedIntArray = new int[n];
        for (int i = 0; i < n; i++) {
            returnedIntArray[i] = i;
        }
        return returnedIntArray;
    }

    public static boolean haveThree(int[] nums) {
        boolean cannotBeThree = false;
        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (cannotBeThree) {
                    return false;
                }
                cannotBeThree = true;
                threeCount += 1;
            }
            cannotBeThree = false;
        }
        return (threeCount == 3);
    }

    public static String[] fizzArray2(int n) {
        String[] returnedArray = new String[n];
        for (int i = 0; i < n; i++) {
            returnedArray[i] = String.valueOf(i);
        }
        return returnedArray;
    }

    public static int[] zeroFront(int[] nums) {
        int[] newArray = new int[nums.length];
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArray[zeroCount] = 0;
                zeroCount += 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[zeroCount] = nums[i];
                zeroCount += 1;
            }
        }
        return newArray;
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        return new String[0];
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        return 0;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        return "";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        return 0.0;
    }
}
