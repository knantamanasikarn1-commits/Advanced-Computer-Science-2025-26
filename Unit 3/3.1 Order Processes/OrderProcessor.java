public class OrderProcessor {

    // There are 3? different sections here that I will pull out:
    // 1) Calculating the subtotal
    // 1a) Making the expensiveItems list
    // 1b) Adding up premiumCount?
    // 2) Trimming premium items
    // 3 Calculate tax and total

    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0;
        for (Item item : items) {
            double price = item.getPrice();
            int quantity = item.getQuantity();

            double itemTotal = price * quantity;
            subtotal += itemTotal;
        }
        return subtotal;
    }

    public static String[] getExpensiveItems(Item[] items) {
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();

            if (price > 50.0) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount += 1;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            }
        }
        return expensiveItemsTemp;
    }

    public static int getPremiumCount(String[] expensiveItemsTemp) {
        // Had to redo this one b/c don't get premiumCount in getExpensiveItems
        int premiumCount = 0;
        for (String itemName: expensiveItemsTemp) {
            if (itemName != null) {
                premiumCount += 1;
            }
        }
        return premiumCount;
    }

    public static String[] trimPremiumItems(String[] expensiveItemsTemp, int premiumCount) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    }

    public static double calculateTax(double subtotal, double taxRate) {
        if (subtotal > 0) {
            return subtotal * taxRate;
        }
        return 0;
    }

    public static double calculateTotal(double subtotal, double tax) {
        if (subtotal > 0) {
            return subtotal + tax;
        }
        return 0;
    }

    public static void printSummary(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);
        String[] expensiveItemsTemp = getExpensiveItems(items);
        int premiumCount = getPremiumCount(expensiveItemsTemp);

        String[] expensiveItems = trimPremiumItems(expensiveItemsTemp, premiumCount);

        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);

        printSummary(subtotal, tax, total, premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }
}
