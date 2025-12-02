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
        if (str == null || str.length() == 0) {
            return "";
        }
        String returnedString = "";
        boolean returnOriginal = true;
        if (str.charAt(0) == 'f') {
            returnedString += "Fizz";
            returnOriginal = false;
        }
        if (str.charAt(str.length() - 1) == 'b') {
            returnedString += "Buzz";
            returnOriginal = false;
        }
        if (returnOriginal) {
            return str;
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
            return true;
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
        int shorterLength;
        if (a.length() > b.length()) {
            shorterLength = b.length();
        } else {
            shorterLength = a.length();
        }
        for (int i = 0; i < shorterLength; i++) {
            returnedString += a.charAt(i);
            returnedString += b.charAt(i);
        }
        if (a.length() > b.length()) {
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
            return (a.substring(a.length() - b.length()).equals(b));
        }
        return (b.substring(b.length() - a.length()).equals(a));
    }

    public static int countCode(String str) {
        if (str.length() <= 3) {
            return 0;
        }
        int codeCount = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
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
        for (int i = 0; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin);
            currentMax = Math.max(nums[i], currentMax);
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
            } else {
                cannotBeThree = false;
            }
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
        int targetCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                targetCount += 1;
            }
        }
        String[] newArray = new String[words.length - targetCount];
        int currentIndexPut = 0;
        for (int i = 0; i < words.length; i++) {
            if (! target.equals(words[i])) {
                newArray[currentIndexPut] = words[i];
                currentIndexPut += 1;
            }
        }
        return newArray;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public static int scoresAverage(int[] scores) {
        int firstAverage = average(scores, 0, scores.length / 2 - 1);
        int secondAverage = average(scores, scores.length / 2, scores.length - 1);
        return Math.max(firstAverage, secondAverage);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestSpecial(int[] scores) {
        int maxSpecial = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 != 0) {
                continue;
            }
            maxSpecial = Math.max(maxSpecial, scores[i]);
        }
        return maxSpecial;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int specialA = getLargestSpecial(a);
        int specialB = getLargestSpecial(b);
        return specialA + specialB;
    }

    public static String firstTwo(String str) {
        if (str.length() == 0) {
            return "**";
        }
        if (str.length() == 1) {
            return str + "*";
        }
        return str.substring(0, 2);
    }

    public static double divide(int a, int b) {
        int larger = Math.max(a, b);
        int smaller = Math.min(a, b);
        if (smaller == 0) {
            return 0.0;
        }
        return (double) larger / smaller;
    }
}
