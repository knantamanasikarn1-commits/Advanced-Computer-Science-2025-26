public class BulletinBoardRunner {

    // thing that interacts with BulletinBoard classes

    public static void main() {
        System.out.println("Hey.");

        BulletinBoard bulletinBoard1 = new BulletinBoard();
        bulletinBoard1.changeText("HELLO");
        bulletinBoard1.pinPoster();
        bulletinBoard1.removePoster();
    }

}