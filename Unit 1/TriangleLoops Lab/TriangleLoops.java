public class TriangleLoops {

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        if (numberOfRows <= 0) {
            return "";
        }
        String triangle = "";
        for (int row = 1; row < numberOfRows + 1; row++) {
            for (int i = 0; i < row; i++) {
                triangle += letter;
            }
            triangle += "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        if (numberOfRows <= 0) {
            return "";
        }
        String triangle = "";
        for (int row = numberOfRows; row > 0; row--) {
            for (int i = 0; i < row; i++) {
                triangle += letter;
            }
            triangle += "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        if (numberOfRows <= 0) {
            return "";
        }
        String triangle = "";
        for (int row = 1; row < numberOfRows + 1; row++) {
            for (int i = 0; i < row; i++) {
                triangle += row + " ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        // A is 35
        if (numberOfRows <= 0) {
            return "";
        }
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        String triangle = "";
        for (int row = 1; row < numberOfRows + 1; row++) {
            for (int spaces = numberOfRows - row - 1; spaces >= 0; spaces--) {
                triangle += " ";
            }
            for (int asc = 65; asc < 65 + row; asc++) {
                triangle += (char) asc;
            }
            for (int desc = 65 + row - 2; desc >= 65; desc--) {
                triangle += (char) desc;
            }
            if (row != numberOfRows) {
                triangle += "\n";
            }
        }
        return triangle;
    }

}