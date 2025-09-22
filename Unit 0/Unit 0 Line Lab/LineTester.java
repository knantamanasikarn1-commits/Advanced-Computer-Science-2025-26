public class LineTester {
    public static void main(String[] args) {

        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); // slope1 should be -1.25 
        System.out.println(slope1);

        // Should be true, as 5(5) + 4(-2) + (-17) = 0
        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 
        System.out.println(onLine1);

        System.out.println(line1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); // slope2 should be 0.625
        System.out.println(slope2);

        // Should be false as -25(5) + 40(-2) + 30 != 0
        boolean onLine2 = line2.isCoordinateOnLine(5, -2); 
        System.out.println(onLine2);

        System.out.println(line2);

        // Testing Lines 3, 4, 5 with coefficients of +-1
        Line line3 = new Line(-1, -3, -1);
        System.out.println(line3);

        Line line4 = new Line(1, 5, -1);
        System.out.println(line4);

        Line line5 = new Line(-1, -6, 5);
        System.out.println(line5);

        // Testing Line 6, 7 equals
        Line line6 = new Line(3, 3, 6);
        Line line7 = new Line(2, 2, 4);
        System.out.println(line6.equals(line7));

        // Testing Line 8, 9, 10, 11 intersection points
        Line line8 = new Line(1, 1, -4);
        Line line9 = new Line(1, -6, 2);
        Line line10 = new Line(2, -12, 4);
        Line line11 = new Line(1, -6, 100);
        System.out.println(line8.getIntersectionPoints(line9));
        System.out.println(line10.getIntersectionPoints(line9));
        System.out.println(line11.getIntersectionPoints(line9));

        // Testing Line 12, 13 random pt generation
        Line line12 = new Line();
        Line line13 = new Line();
        System.out.println(line12);
        System.out.println(line13);
    }
}
