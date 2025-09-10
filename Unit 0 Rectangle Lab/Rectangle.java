public class Rectangle {

    // Instance variables

    private int length;
    private int width;
    private int[][] vertices;

    // Constructors

    public Rectangle(int startX, int startY, int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
        this.vertices = new int[][] {
            {startX, startY}, {startX + width, startY}, 
            {startX + width, startY + length}, {startX, startY + length}};
    }

    public Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
        this.vertices = new int[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
    }

    public Rectangle() {
        this.length = 3;
        this.width = 4;
        this.vertices = new int[][] {{0, 0}, {width, 0}, {width, length}, {0, length}};
    }

    // Getters

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int[][] getVertices() {
        return vertices;
    }

    // Setters

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
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

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public void rotateNicely(int[] originOfRot, int num90DegTurns) {
        int[][] movedVertices = vertices;
        for (int[] vertex : movedVertices) {
            vertex[0] -= originOfRot[0];
            vertex[1] -= originOfRot[1];
        }
        for (int i = 0; i < num90DegTurns; i++) {
            for (int[] vertex : movedVertices) {
                int[] newVertex = new int[] {vertex[1], -1 * vertex[0]};
                vertex[0] = newVertex[0];
                vertex[1] = newVertex[1];
            }
        }
        for (int[] vertex : movedVertices) {
            vertex[0] += originOfRot[0];
            vertex[1] += originOfRot[1];
        }
        vertices = movedVertices;
    }

    public void rotateNotNicely(double[] originofRot, double degrees) {
        
    }

    public String verticiesToString() {
        String returnedString = "";
        for (int[] point : vertices) {
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