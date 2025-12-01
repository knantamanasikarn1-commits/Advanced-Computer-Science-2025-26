public class Unit2ExercisesTester {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 0, 0, 4};
        int[] newArray = Unit2Exercises.zeroFront(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
