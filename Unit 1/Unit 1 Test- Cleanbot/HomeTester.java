public class HomeTester {
    public static void main(String[] args) {
        Home testHome = new Home("1234 Big Street", "   Kai   Nantamanasikarn   ", 3);
        System.out.println(testHome.getOwnerName());
        System.out.println(testHome.getUsername());
        testHome.setCleanlinessLevel(-1);
        System.out.println(testHome.getCleanlinessLevel());
        System.out.println(testHome.toString());
        Home copyTestHome = new Home("1234 Big Street", "Kai Nantamanasikarn", 0);
        System.out.println(copyTestHome.toString());
        System.out.println(testHome.equals(copyTestHome));
        Home differentHome = new Home();
        System.out.println(testHome.equals(differentHome));
    }
}
