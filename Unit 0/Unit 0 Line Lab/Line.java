public class Line {
    int a, b, c;

    public Line() {
        generateRandomParameters();
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public boolean isCoordinateOnLine(int x, int y) {
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

}