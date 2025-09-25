public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank(3, 5); // instantiate a new Bank object

        Bank bank2 = new Bank(4, 5); // instantiate a new Bank object

        System.out.println(bank1.computeTotalEmployees()); // should print 8

        bank2.setNumberOfLoanOfficers(3); // bank2 now has 3 loan officers

        System.out.println(bank1.getNumberOfTellers()); // should print 5

        System.out.println(bank1.equals(bank2)); // should print true

        System.out.println(bank2); // prints "This bank has 3 loan officers
        // and 5 tellers."

        System.out.println(bank1.getEmployeeRatio()); // 3/5 -> 0.6
        System.out.println(bank1);
        bank1.fireMembers(2, true); // 1, 5
        System.out.println(bank1);
        bank1.fireMembers(3, false); // 1, 2
        System.out.println(bank1);
        bank1.transferEmployee(false); // 2, 1
        System.out.println(bank1);
        System.out.println(bank1.calculateTotalSalary()); // 195000

    }
}