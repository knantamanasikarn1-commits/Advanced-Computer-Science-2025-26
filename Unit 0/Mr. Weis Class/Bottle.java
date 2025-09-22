public class Bottle {

    private String color;
    private double weight;
    private int price;
    private String brand;

    // constructor will go here later

    public void drinkMe(double amount) {
        if (amount <= weight) {
            weight = weight - amount;
        }
        else {
            System.out.println("Not enough fluid.");
        }
    }

}