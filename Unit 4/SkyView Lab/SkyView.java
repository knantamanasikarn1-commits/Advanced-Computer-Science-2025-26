public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be + ints.");
        }
        if (scanned.length != numberOfRows * numberOfCols) {
            throw new IllegalArgumentException("Scanned length is not same as matrix dimensions.");
        }
        view = new double[numberOfRows][numberOfCols];
        int currentRow = 0;
        int currentCol = 0;
        boolean isIncreasing = true;
        for (int i = 0; i < scanned.length; i++) {
            view[currentRow][currentCol] = scanned[i];
            currentCol += (isIncreasing ? 1 : -1);
            if (isIncreasing && currentCol == numberOfCols) {
                isIncreasing = false;
                currentCol = numberOfCols - 1;
                currentRow += 1;
            } else if (! isIncreasing && currentCol == -1) {
                isIncreasing = true;
                currentCol = 0;
                currentRow += 1;
            }
        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String viewString = "";
        for (int row = 0; row < view.length; row++) {
            for (int column = 0; column < view[row].length; column++) {
                viewString += view[row][column] + " ";
            }
            viewString += "\n";
        }
        return viewString;
    }

    public boolean equals(SkyView other) {
        double[][] otherView = other.view;
        if (otherView.length != view.length) {
            return false;
        }
        for (int row = 0; row < view.length; row++) {
            if (view[row].length != otherView[row].length) {
                return false;
            }
            for (int column = 0; column < view[row].length; column++) {
                if (view[row][column] != otherView[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int numTerms = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int column = startCol; column <= endCol; column++) {
                sum += view[row][column];
                numTerms += 1;
            }
        }
        return sum / numTerms;
    }

}