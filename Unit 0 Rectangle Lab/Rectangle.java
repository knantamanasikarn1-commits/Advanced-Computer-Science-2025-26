public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public Rectangle() {
        this.length = 3;
        this.width = 4;
    }

    public String toString() {
        int area = length * width;
        return "This rectangle has a length of " + length + " and a width of " + width + ". It's area is " + area + ".";
    }

}