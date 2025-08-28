public class BulletinBoard {

    // class def only has info about it

    private String text;
    private int numPosters;
    private String color;
    private String location;
    private boolean hasSpaceLeft;

    public BulletinBoard() {
        // constructor, name matches class
        text = "COME FOR MATH HELP";
        numPosters = 1;
        color = "tan";
        location = "Chalmers";
        hasSpaceLeft = true;
    }

    // pinPoster, removePoster, changeText
    
    public void pinPoster() {
        if (hasSpaceLeft) {
            numPosters += 1;
            System.out.println("You have pinned a new poster on the board. There are now a total of " + numPosters + " posters.");
            if (numPosters == 10) {
                hasSpaceLeft = false;
                System.out.println("There is no more space on the board.");
            }
        }
        else {
            System.out.println("You cannot pin new posters on the board. Please move or remove one first.");
        }
        return;
    }

    public void removePoster() {
        numPosters -= 1;
        hasSpaceLeft = true;
        System.out.println("You have removed a poster from the board.");
        return;
    }

    public void changeText() {
        text = "MATH FINALS COMING SOON";
        System.out.println("You have changed the board's text.");
        return;
    }

    public void movePoster() {
        hasSpaceLeft = true;
        System.out.println("You have moved a poster on the board, creating space.");
        return;
    }

}