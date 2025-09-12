public class Rectangle {

    // Instance variables

    private double length;
    private double width;
    private double[][] originalVertices;
    private double[][] currentVertices;
    private double rotationDegrees;

    // Constructors

    public Rectangle(double startX, double startY, double newLength, double newWidth) {
        this.length = newLength;
        this.width = newWidth;
        this.originalVertices = new double[][] {
            {startX, startY}, {startX + width, startY}, 
            {startX + width, startY + length}, {startX, startY + length}};
        this.currentVertices = new double[][] {
            {startX, startY}, {startX + width, startY}, 
            {startX + width, startY + length}, {startX, startY + length}};
        this.rotationDegrees = 0;
    }

    public Rectangle(double newLength, double newWidth) {
        this.length = newLength;
        this.width = newWidth;
        this.originalVertices = new double[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
        this.currentVertices = new double[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
        this.rotationDegrees = 0;
    }

    public Rectangle() {
        this.length = 3;
        this.width = 4;
        this.originalVertices = new double[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
        this.currentVertices = new double[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
        this.rotationDegrees = 0;
    }

    // Getters

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double[][] getOriginalVertices() {
        return originalVertices;
    }

    public double[][] getCurrentVertices() {
        return currentVertices;
    }

    public double getRotationDegrees() {
        return rotationDegrees;
    }

    // Setters

    public void setLength(double newLength) {
        length = newLength;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    // Methods

    public String toString() {
        return "This rectangle has a length of " + length + " and a width of "
            + width + ". It's area is " + getArea() + ".";
    }

    public boolean equals(Rectangle other) {
        if (length == other.getLength() && width == other.getWidth()) {
            return true;
        }
        return false;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public void rotateNicely(double[] originOfRot, int num90DegTurns) {
        for (double[] vertex : currentVertices) {
            vertex[0] -= originOfRot[0];
            vertex[1] -= originOfRot[1];
        }
        for (double i = 0; i < num90DegTurns; i++) {
            for (double[] vertex : currentVertices) {
                double[] newVertex = {vertex[1], -1 * vertex[0]};
                vertex[0] = newVertex[0];
                vertex[1] = newVertex[1];
            }
        }
        for (double[] vertex : currentVertices) {
            vertex[0] += originOfRot[0];
            vertex[1] += originOfRot[1];
        }
        rotationDegrees = (rotationDegrees + 90 * num90DegTurns) % 360;
    }

    public void rotateNotNicely(double[] originOfRot, double degrees) {
        rotationDegrees = (rotationDegrees + degrees) % 360;
        double radians = 2 * Math.PI - degrees * Math.PI / 180;
        for (double[] vertex : vertices) {

            // Translation

            vertex[0] -= originOfRot[0];
            vertex[1] -= originOfRot[1];

            // Rotation

            double[] newVertex = {
                vertex[0] * Math.cos(radians) - vertex[1] * Math.sin(radians), 
                vertex[1] * Math.cos(radians) + vertex[0] * Math.sin(radians)};
            vertex[0] = newVertex[0];
            vertex[1] = newVertex[1];

            // Translation

            vertex[0] += originOfRot[0];
            vertex[1] += originOfRot[1];
        }
    }

    public String verticiesToString() {
        String returnedString = "";
        for (double[] point : vertices) {
            returnedString += ("(" + point[0] + ", " + point[1] + ") ");
        }
        return returnedString;
    }

    public String verticiesToDesmos() {
        String returnedString = "polygon(";
        for (int i = 0; i < 4; i++) {
            returnedString += ("(" + vertices[i][0] + ", " + vertices[i][1] + ")");
            if (i != 3) {
                returnedString += ", ";
            } else {
                returnedString += ")";
            }
        }
        return returnedString;
    }

}