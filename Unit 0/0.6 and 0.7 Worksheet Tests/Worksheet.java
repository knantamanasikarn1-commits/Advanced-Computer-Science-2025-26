public class Worksheet {
    public static void main(String[] args) {
        // double x = 7;
        // double z = 123.456;
        // int a = 5;
        // int b = 2;
        // char letter = 'H';

        // System.out.println(3 + 3 * 3 % 2);
        // System.out.println(a * (a + b));
        // System.out.println('a' * (a + b));
        // System.out.println('a' + '/');
        // System.out.println(1 % 5);
        // System.out.println(a % b);
        // System.out.println(b % a);
        // System.out.println(a / b);
        // System.out.println(b / a);
        // System.out.println(a / x);
        // System.out.println(letter + 5 * b);
        // System.out.println(z * a + b / x);
        // System.out.println(z / a * b + x);
        // System.out.println(a % b % a);
        // System.out.println(z % 120);
        // System.out.println(13 % 2);
        // System.out.println(8 / 2 * 3 % 5);

        int x = 5;
        int y = 2;
        double z = 4.0;
        int k;
        double p;

        k = x / y;
        System.out.println("Line 1: " + k);
        // k = z / x;
        // System.out.println("Line 2: " + k);
        k = (int) z / y;
        System.out.println("Line 3: " + k);
        k = (int) (z / y);
        System.out.println("Line 4: " + k);
        p = x / y;
        System.out.println("Line 5: " + p);
        p = z / x;
        System.out.println("Line 6: " + p);
        p = (int) z / y;
        System.out.println("Line 7: " + p);
        p = (double) x / y;
        System.out.println("Line 8: " + p);
        p = (double) (x / y);
        System.out.println("Line 9: " + p);
    }
}