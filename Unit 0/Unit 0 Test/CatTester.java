public class CatTester {
    public static void main(String[] args) {
        // 1. added 'new' keyword in front of constructors
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        // 2. put in System.out.println()
        System.out.println("My Cat's Name: " + myCat.getName());
        
        // 3. changed 'return' to System.out.println()
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));

        // 4. changed 'print' to System.out.println()
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());

        String firstName = "Tiger";
        // 5. changed == to = for variable declaration
        String lastName = "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}