public class RectangleTester {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5, 12);
        Rectangle rect2 = new Rectangle(9, 16);
        
        System.out.println(rect1.verticiesToDesmos());
        int[] point = {1, 0};
        rect1.rotateNicely(point, 3);
        System.out.println(rect1.verticiesToDesmos());

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        rect1.setLength(9);
        rect2.setWidth(12);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

        if (rect1.equals(rect2)) {
            System.out.println("The rectangles are equal / the same.");
        } else {
            System.out.println("The rectangles are not equal / different.");
        }

        System.out.println("rect1's diagonal: " + rect1.getDiagonal());
        System.out.println("rect2's diagonal: " + rect2.getDiagonal());
    }
}