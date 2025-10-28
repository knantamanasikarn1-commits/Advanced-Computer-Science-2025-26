public class CatTester {
    public static void main(String[] args) {

        Cat testCat = new Cat("Espurr", "Kai", 8, "1234");

        System.out.println(testCat.getName());
        testCat.setName("Meowstic");
        System.out.println(testCat.getName());
        System.out.println();

        System.out.println(testCat.getCatChar());
        testCat.setCatChar('A');
        System.out.println(testCat.getCatChar());
        System.out.println();

        System.out.println(testCat.getOwnerName());
        testCat.setOwnerName("Other Kai");
        System.out.println(testCat.getOwnerName());
        System.out.println();

        System.out.println(testCat.getMoodLevel());
        testCat.setMoodLevel(5);
        System.out.println(testCat.getMoodLevel());
        System.out.println();

        System.out.println(testCat.getCatId());
        testCat.setCatId("5678");
        System.out.println(testCat.getCatId());
        System.out.println();

        System.out.println(testCat.isHungry());
        testCat.setHungry(false);
        System.out.println(testCat.isHungry());
        System.out.println();

        Cat duplicateCat = new Cat("Meowstic", "Other Kai", 5, "5678");
        duplicateCat.setHungry(false);
        System.out.println(testCat.equals(duplicateCat));
        System.out.println();

        PurrfectUtils.bootUp(testCat);
        System.out.println();

        PurrfectUtils.pet(testCat);
        System.out.println();

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(testCat);
        }
        System.out.println();

        PurrfectUtils.cleanLitterBox(testCat);
        System.out.println();

        PurrfectUtils.feed(testCat);
        System.out.println();
    }
}
