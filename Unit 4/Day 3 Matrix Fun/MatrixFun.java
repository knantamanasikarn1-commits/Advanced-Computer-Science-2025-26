public class MatrixFun {

    private int[][] matrix;

    // Constructors and Helper Methods

    public MatrixFun(int numberOfRows, int numberOfCols) {
        createRandomMatrix(numberOfRows, numberOfCols);
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = validateMatrix(starterMatrix);
    }

    public MatrixFun() {
        createRandomMatrix(3, 3);
    }

    public void createRandomMatrix(int rows, int columns) {
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Must have positive rows/columns.");
        }
        this.matrix = new int[rows][columns];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    public int[][] validateMatrix(int[][] matrix) {
        if (matrix.length <= 1) {
            return matrix;
        }
        int firstLength = matrix[0].length;
        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r].length != firstLength) {
                throw new IllegalArgumentException("The matrix is not rectangular.");
            }
        }
        return matrix;
    }

    // Getters/Setters

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = validateMatrix(matrix);
    }

    // Methods

    public String toString() {
        String matrixString = "";
        matrixString += "=".repeat(matrix[0].length * 2 - 1) + "\n";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrixString += String.valueOf(matrix[r][c]) + " ";
            }
            matrixString += "\n";
        }
        matrixString += "=".repeat(matrix[0].length * 2 - 1) + "\n";
        return matrixString;
    }

    public boolean equals(MatrixFun otherMatrix) {
        return this.toString().equals(otherMatrix.toString());
    }

    public boolean equals(int[][] otherMatrix) {
        if (matrix.length != otherMatrix.length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r].length != otherMatrix[r].length) {
                return false;
            }
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] != otherMatrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (matrix[r][c] == oldValue) ? newValue : matrix[r][c];
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA >= matrix.length || rowB >= matrix.length || rowA < 0 || rowB < 0) {
            throw new IllegalArgumentException("Row indices are out of bounds.");
        }
        int[] tempRowA = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = tempRowA;
    }

}
