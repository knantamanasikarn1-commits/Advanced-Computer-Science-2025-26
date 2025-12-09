public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < 10; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int creditCount = 0;
        for (int i = 0; i < 10; i++) {
            if (loyaltyCredits[i]) {
                creditCount += 1;
            }
        }
        return creditCount;
    }

    public String determineMembershipStatus() {
        int numCredits = countLoyaltyCredits();
        if (numCredits >= 6) {
            return "Gold Member";
        } else if (numCredits >= 3) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String returnedString = "Loyalty History: [";
        for (int i = 0; i < 10; i++) {
            if (loyaltyCredits[i]) {
                returnedString += "X";
            } else {
                returnedString += "-";
            }
            if (i == 9) {
                returnedString += "]";
            } else {
                returnedString += ",";
            }
        }
        return returnedString;
    }

    public String toString() {
        String returnedString = this.name + " (" + determineMembershipStatus() + "), "
                                    + loyaltyHistory();
        return returnedString;
    }

    public boolean equals(TheaterMember other) {
        return (countLoyaltyCredits() == other.countLoyaltyCredits()
                    && this.name.equals(other.name));
    }

}
