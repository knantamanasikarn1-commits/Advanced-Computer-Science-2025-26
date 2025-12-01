public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit2Exercises.alarmClock(1, false)); // 7:00
        System.out.println(Unit2Exercises.alarmClock(5, false)); // 7:00
        System.out.println(Unit2Exercises.alarmClock(0, false)); // 10:00
        System.out.println();
        System.out.println(Unit2Exercises.love6(6, 4)); // true
        System.out.println(Unit2Exercises.love6(4, 5)); // false
        System.out.println(Unit2Exercises.love6(1, 5)); // true
        System.out.println();
        System.out.println(Unit2Exercises.redTicket(2, 2, 2)); // 10
        System.out.println(Unit2Exercises.redTicket(2, 2, 1)); // 0
        System.out.println(Unit2Exercises.redTicket(0, 0, 0)); // 5
        System.out.println();
        System.out.println(Unit2Exercises.fizzString("fig")); // Fizz
        System.out.println(Unit2Exercises.fizzString("dib")); // Buzz
        System.out.println(Unit2Exercises.fizzString("fib")); // FizzBuzz
        System.out.println();
        System.out.println(Unit2Exercises.doubleChar("The"));
        System.out.println(Unit2Exercises.doubleChar("AAbb"));
        System.out.println(Unit2Exercises.doubleChar("Hi-There"));
        System.out.println();
        System.out.println(Unit2Exercises.countHi(null));
    }
}
