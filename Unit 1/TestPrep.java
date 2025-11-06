public class TestPrep {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(a.indexOf("2"));
        System.out.println(a.indexOf("234"));
        System.out.println(a.indexOf("5"));
        System.out.println(a.charAt(0));
        System.out.println(Integer.parseInt(a));
        System.out.println(Integer.parseInt(a) + 1);
        System.out.println(a.substring(0, 3));
        System.out.println(a.substring(2));
        System.out.println();
        int b = 1;
        Integer c = 1;
        System.out.println(Integer.toString(b));
        System.out.println(c.toString());

        // Static methods & helper classes
        // For loops, while loops
        // String: toUpper, toLower, indexOf, charAt, substring (1 & 2 args), length
        // Integer: toString, parseInt
    }
}