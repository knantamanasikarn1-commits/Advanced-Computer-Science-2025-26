public class BulletinBoardRunner {

    // thing that interacts with BulletinBoard classes

    public static void main() {
        System.out.println("Hey.");

        BulletinBoard bulletinBoard1 = new BulletinBoard();
        bulletinBoard1.changeText("HELLO");
        bulletinBoard1.pinPoster();
        bulletinBoard1.removePoster();

        System.out.println(bulletinBoard1.toString());

        BulletinBoard bulletinBoard2 = new BulletinBoard();
        System.out.print("Are the two bulletin boards equal?: ");
        System.out.println(bulletinBoard1.equals(bulletinBoard2));
    }

}