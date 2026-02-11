public class Square extends Rectangle {
    
    public Square() {
        this(4);
    }

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public String toString() {
        return super.toString() + "\nIt is also a square.";
    }

}
