public class TriangleLoopsTester {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(15, 'B'));
        System.out.println("TUp - Loops: " + TriangleLoops.createLetterTriangleUp(-15, 'C') + "\n");

        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'B'));
        System.out.println("TDown - Loops: " + TriangleLoops.createLetterTriangleDown(-15, 'C'));
        System.out.println();

        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println("NumT - Loops: " + TriangleLoops.createNumbersTriangle(-15) + "\n");

        System.out.println(TriangleLoops.createAlphabetTriangle(5) + "\n");
        System.out.println(TriangleLoops.createAlphabetTriangle(27) + "\n");
        System.out.println("AlphaT - Loops: " + TriangleLoops.createAlphabetTriangle(-15) + "\n");

    }
}
