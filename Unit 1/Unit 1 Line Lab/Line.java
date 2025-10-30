public class Line {
    int a;
    int b;
    int c;
    private Point p1;
    private Point p2;

    public Line() {
        generateRandomParameters();
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY()); 
        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 
        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void generateRandomParameters() {
        if (Math.random() > 0.5) {
            a = (int) (Math.random() * 10 + 1);
        } else {
            a = -1 * (int) (Math.random() * 10 + 1);
        }
        if (Math.random() > 0.5) {
            b = (int) (Math.random() * 10 + 1);
        } else {
            b = -1 * (int) (Math.random() * 10 + 1);
        }
        c = (int) (Math.random() * 21 - 10);
    }

    public double calculateSlope() {
        return (double) -1 * a / b;
    }

    public boolean isCoordinateOnLine(Point p) {
        int x = p.getX();
        int y = p.getY();
        if (a * x + b * y + c == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String returnedString = "Equation: ";

        if (a == 1) {
            returnedString += "x ";
        } else if (a == -1) {
            returnedString += "-x ";
        } else {
            returnedString += a + "x ";
        }

        if (b == 1) {
            returnedString += "+ y ";
        } else if (b == -1) {
            returnedString += "- y ";
        } else if (b > 0) {
            returnedString += "+ " + b + "y ";
        } else if (b < 0) {
            returnedString += "- " + Math.abs(b) + "y ";
        }

        if (c >= 0) {
            returnedString += "+ " + c;
        } else {
            returnedString += "- " + Math.abs(c);
        }
        returnedString += " = 0";
        return returnedString;
    }

    public boolean equals(Line other) {
        // if (a != other.a) {
        //     return false;
        // }
        // if (b != other.b) {
        //     return false;
        // }
        // if (c != other.c) {
        //     return false;
        // }
        // return true;
        if ((double) a / other.a != (double) b / other.b) {
            return false;
        }
        if ((double) b / other.b != (double) c / other.c) {
            return false;
        }
        return true;
    }

    public boolean isParallel(Line other) {
        if (calculateSlope() == other.calculateSlope()) {
            return true;
        }
        return false;
    }

    public String getIntersectionPoints(Line other) {
        if (equals(other)) {
            return "The two lines are the same, so they intersect at infinitely many points.";
        }
        if (isParallel(other)) {
            return "The two lines are parallel, so they do not intersect.";
        }
        double intersectX = (double) (b * other.c - c * other.b) / (a * other.b - b * other.a);
        double intersectY = (double) (a * other.c - c * other.a) / (b * other.a - a * other.b);
        return "The intersection point is about (" + intersectX + ", " + intersectY + ").";
    }

    public String generatePointSlopeFormula() {
        String returnedString = "(y ";
        if (p1.getY() > 0) {
            returnedString += "- " + p1.getY();
        } else if (p1.getY() < 0) {
            returnedString += "+ " + (p1.getY() * -1);
        } else {
            returnedString += "- 0";
        }
        returnedString += ") = " + calculateSlopeFromPoints() + "(x ";
        if (p1.getX() > 0) {
            returnedString += "- " + p1.getX();
        } else if (p1.getX() < 0) {
            returnedString += "+ " + (p1.getX() * -1);
        } else {
            returnedString += "- 0";
        }
        returnedString += ")";
        return returnedString;
    }

    public double calculateSlopeFromPoints() {
        int deltaY = p2.getY() - p1.getY();
        int deltaX = p2.getX() - p1.getX();
        return ((double) deltaY) / deltaX;
    }

}