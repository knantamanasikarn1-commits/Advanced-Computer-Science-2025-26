public class BulletinBoard {

    // class def only has info about it

    // instance variables
    
    private String text;
    private int numPosters;
    private String color;
    private String location;
    private boolean hasSpaceLeft;

    public BulletinBoard() {

        // constructor: instruction for making instance of class, name matches class

        text = "COME FOR MATH HELP";
        numPosters = 1;
        color = "tan";
        location = "Chalmers";
        hasSpaceLeft = true;
    }

    // methods: pinPoster, removePoster, changeText (identifiers are listed)
    // can put in parameters for methods in () like those in pinPoster()
    // private methods are usually used by public methods
    // method header/signature: public void pinPoster()
        //  modifier, thing returned, identifier, ()
    // void as a "thing returned" means that nothing is being returned, it's just changing variables
        // print is not returning

    public void pinPoster() {

        // method body

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

    public void changeText(String newText) {
        text = newText;
        System.out.println("You have changed the board's text. It now reads: " + text + ".");
        return;
    }

    public void movePoster() {
        hasSpaceLeft = true;
        System.out.println("You have moved a poster on the board, creating space.");
        return;
    }

    public void replaceFabric(String newFabricColor) {
        color = newFabricColor;
        System.out.println("You have changed the board's fabric. It is now " + color + ".");
    }

    public void moveBoard(String newLocation) {
        location = newLocation;
        System.out.println("You have moved the board to " + location + ".");
    }

    public String toString() {
        return "This is a " + color + " bulletin board that says \"" + text + 
        "\", located at " + location + " and containing " + numPosters + " poster(s).";
    }

    public boolean equals(BulletinBoard anotherBulletinBoard) {
        if (
            this.text.equals(anotherBulletinBoard.text) &&
            this.numPosters == anotherBulletinBoard.numPosters &&
            this.color.equals(anotherBulletinBoard.color) &&
            this.location.equals(anotherBulletinBoard.location) &&
            this.hasSpaceLeft == anotherBulletinBoard.hasSpaceLeft
        ) {
            return true;
        }
        return false;
    }

}