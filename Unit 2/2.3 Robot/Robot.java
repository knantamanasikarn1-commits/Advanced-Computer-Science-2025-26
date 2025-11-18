public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = validateHallway(hallwayToClean);
        this.position = validatePosition(startingPosition, this.hallway);
        this.isFacingRight = true;
    }

    public static int validatePosition(int position, int[] hallway) {
        if (position < 0) {
            return 0;
        }
        if (position > hallway.length - 1) {
            return hallway.length - 1;
        }
        return position;
    }

    public static int[] validateHallway(int[] hallway) {
        int[] validatedHallway = new int[hallway.length];
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                validatedHallway[i] = 0;
            } else {
                validatedHallway[i] = hallway[i];
            }
            // validatedHallway[i] = Math.max(0, hallway[i]);
        }
        return validatedHallway;
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = validateHallway(hallway);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = validatePosition(position, hallway);
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        return ((position == 0 && !isFacingRight)
                    || (position == hallway.length - 1 && isFacingRight));
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway[position] != 0) {
            pickup();
        }
        if (hallway[position] != 0) {
            return;
        }
        if (!isRobotBlockedByWall()) {
            moveForward();
        } else {
            turnAround();
        }
    }

    private void pickup() {
        hallway[position] -= 1;
    }

    private void turnAround() {
        isFacingRight = !isFacingRight;
    }

    private void moveForward() {
        if (isFacingRight) {
            position += 1;
        } else {
            position -= 1;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        while (!hallIsClear()) {
            move();
            displayState();
            count += 1;
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        boolean isClear = true;
        int checkIndex = 0;
        while (isClear && checkIndex < hallway.length) {
            if (hallway[checkIndex] != 0) {
                isClear = false;
            }
            checkIndex += 1;
        }
        return isClear;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        String hallwayNums = "";
        String robotPos = "";
        for (int i = 0; i < hallway.length; i++) {
            hallwayNums += hallway[i] + " ";
            if (i == position) {
                if (isFacingRight) {
                    robotPos += ">";
                } else {
                    robotPos += "<";
                }
                
            } else {
                robotPos += "  ";
            }
        }
        System.out.println(hallwayNums);
        System.out.println(robotPos);
    }
}
