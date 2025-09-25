public class Bank {
    
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        String returnedString = "This bank has ";
        if (numberOfLoanOfficers == 1) {
            returnedString += "1 loan officer ";
        } else {
            returnedString += numberOfLoanOfficers + " loan officers ";
        }
        if (numberOfTellers == 1) {
            returnedString += "and 1 teller.";
        } else {
            returnedString += "and " + numberOfTellers + " tellers.";
        }
        return returnedString;
    }

    public boolean equals(Bank other) {
        if (numberOfLoanOfficers != other.numberOfLoanOfficers) {
            return false;
        }
        if (numberOfTellers != other.numberOfTellers) {
            return false;
        }
        return true;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers -= Math.min(numberToFire, numberOfLoanOfficers);
        } else {
            numberOfTellers -= Math.min(numberToFire, numberOfTellers);
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            if (numberOfLoanOfficers > 0) {
                numberOfLoanOfficers -= 1;
                numberOfTellers += 1;
            }
        } else {
            if (numberOfTellers > 0) {
                numberOfLoanOfficers += 1;
                numberOfTellers -= 1;
            }
        }
    }

    public int calculateTotalSalary() {
        return 75000 * numberOfLoanOfficers + 45000 * numberOfTellers;
    }

}
