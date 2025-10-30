public class Unit1ExercisesTester {
    public static void main(String[] args) {
        /*
     * Tester examples:
     * helloName("Bob") -> "Hello Bob!"
     * helloName("Alice") -> "Hello Alice!"
     * helloName("X") -> "Hello X!"
     */
        System.out.println(Unit1Exercises.helloName("Bob"));
        System.out.println(Unit1Exercises.helloName("Alice"));
        System.out.println(Unit1Exercises.helloName("X"));

    /*
     * Tester examples:
     * makeOutWord("<<>>", "Yay") -> "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") -> "<<WooHoo>>"
     * makeOutWord("[[]]", "word") -> "[[word]]"
     */
        System.out.println(Unit1Exercises.makeOutWord("<<>>", "Yay"));
        System.out.println(Unit1Exercises.makeOutWord("<<>>", "WooHoo"));
        System.out.println(Unit1Exercises.makeOutWord("[[]]", "word"));

    /*
     * Tester examples:
     * withoutEnd("Hello") -> "ell"
     * withoutEnd("java") -> "av"
     * withoutEnd("coding") -> "odin"
     */
        System.out.println(Unit1Exercises.withoutEnd("Hello"));
        System.out.println(Unit1Exercises.withoutEnd("java"));
        System.out.println(Unit1Exercises.withoutEnd("coding"));
    
    // Tester examples:
    /*
     * comboString("Hello", "hi") -> "hiHellohi"
     * comboString("hi", "Hello") -> "hiHellohi"
     * comboString("aaa", "b") -> "baaab"
     */
        System.out.println(Unit1Exercises.comboString("Hello", "hi"));
        System.out.println(Unit1Exercises.comboString("hi", "Hello"));
        System.out.println(Unit1Exercises.comboString("aaa", "b"));

    /*
     * Tester examples:
     * left2("Hello") -> "lloHe"
     * left2("java") -> "vaja"
     * left2("Hi") -> "Hi"
     */
        System.out.println(Unit1Exercises.left2("Hello"));
        System.out.println(Unit1Exercises.left2("java"));
        System.out.println(Unit1Exercises.left2("Hi"));

    /*
     * Tester examples:
     * middleThree("Candy") -> "and"
     * middleThree("and") -> "and"
     * middleThree("solving") -> "lvi"
     */
        System.out.println(Unit1Exercises.middleThree("Candy"));
        System.out.println(Unit1Exercises.middleThree("and"));
        System.out.println(Unit1Exercises.middleThree("solving"));

    /*
     * Tester examples:
     * withoutEnd2("Hello") -> "ell"
     * withoutEnd2("abc") -> "b"
     * withoutEnd2("ab") -> ""
     */
        System.out.println(Unit1Exercises.withoutEnd2("Hello"));
        System.out.println(Unit1Exercises.withoutEnd2("abc"));
        System.out.println(Unit1Exercises.withoutEnd2("ab"));

    /*
     * Tester examples:
     * stringEnds("Hello", 2) -> "Helo"
     * stringEnds("Chocolate", 3) -> "Choate"
     * stringEnds("Chocolate", 1) -> "Ce"
     */
        System.out.println(Unit1Exercises.stringEnds("Hello", 2));
        System.out.println(Unit1Exercises.stringEnds("Chocolate", 3));
        System.out.println(Unit1Exercises.stringEnds("Chocolate", 1));

    /*
     * Tester examples:
     * hasBad("badxx") -> true
     * hasBad("xbadxx") -> true
     * hasBad("xxbadxx") -> false
     */
        System.out.println(Unit1Exercises.hasBad("badxx"));
        System.out.println(Unit1Exercises.hasBad("xbadxx"));
        System.out.println(Unit1Exercises.hasBad("xxbadxx"));

    /*
     * Tester examples:
     * countVowels("Hello") -> 2
     * countVowels("abc") -> 1
     * countVowels("") -> 0
     */
        System.out.println(Unit1Exercises.countVowels("Hello"));
        System.out.println(Unit1Exercises.countVowels("abc"));
        System.out.println(Unit1Exercises.countVowels(""));

    /*
     * Tester examples:
     * countCode("aaacodebbb") -> 1
     * countCode("codexxcode") -> 2
     * countCode("cozexxcope") -> 2
     */
        System.out.println(Unit1Exercises.countCode("aaacodebbb"));
        System.out.println(Unit1Exercises.countCode("codexxcode"));
        System.out.println(Unit1Exercises.countCode("cozexxcope"));
    }
}
