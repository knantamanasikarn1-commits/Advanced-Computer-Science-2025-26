public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);
        double slope = pointLine.calculateSlope();
        double slopeFromPoints = pointLine.calculateSlopeFromPoints();
        System.out.println("calculateSlope(): " + slope);
        System.out.println("calculateSlopeFromPoints(): " + slopeFromPoints);
        System.out.println("Are the slopes equal?: " + (slope == slopeFromPoints));
        System.out.println("p1: " + pointLine.isCoordinateOnLine(p1));
        System.out.println("p2: " + pointLine.isCoordinateOnLine(p2));
        System.out.println("p3: " + pointLine.isCoordinateOnLine(p3));
        System.out.println("p4: " + pointLine.isCoordinateOnLine(p4));
        System.out.println(pointLine.generatePointSlopeFormula());
    }
}
