public class MatrixFunTester {
    public static void main(String[] args) {

        int[][] testMatrix = {{1, 2}, {3, 4}};
        MatrixFun matrix1 = new MatrixFun(2, 2);
        MatrixFun matrix2 = new MatrixFun(testMatrix);
        MatrixFun matrix3 = new MatrixFun();

        System.out.println(matrix1.toString());
        System.out.println(matrix2.toString());
        System.out.println(matrix3.toString());

        System.out.println("Expected false (matrix1,2 =?): " + matrix1.equals(matrix2));
        System.out.println("Expected true (matrix2, its matrix =?): " + matrix2.equals(testMatrix));
        System.out.println();

        matrix2.replaceAll(1, 9);
        System.out.println(matrix2.toString());

        System.out.println("Before swap first two:");
        System.out.println(matrix3.toString());
        matrix3.swapRow(0, 1);
        System.out.println("After swap first two:");
        System.out.println(matrix3.toString());

    }
}