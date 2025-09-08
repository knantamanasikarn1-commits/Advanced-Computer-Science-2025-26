public class Rectangle {

    // Instance variables

    private int length;
    private int width;

    // Constructors

    public Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public Rectangle() {
        this.length = 3;
        this.width = 4;
    }

    // Getters

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
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
        return "This rectangle has a length of " + length + " and a width of " + 
        width + ". It's area is " + getArea() + ".";
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

}