public class Home {
    private String address;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean isScheduled;

    public Home(String address, String ownerName, int cleanlinessLevel) {
        this.address = address;
        this.ownerName = CleanUtils.fixName(ownerName);
        this.username = CleanUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.isScheduled = false;
    }

    public Home() {
        this.address = "123 Main Ave.";
        this.ownerName = "Kai Nantamanasikarn";
        this.username = CleanUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = 5;
        this.isScheduled = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return CleanUtils.fixName(ownerName);
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String toString() {
        String returnedString = "== ABOUT HOME ==\nAddress: " + address
                                    + "\nOwner: " + ownerName + "\nUsername: " + username
                                    + "\nCleanliness Level: " + cleanlinessLevel
                                    + "\nIs scheduled for cleaning? ";
        if (isScheduled) {
            returnedString += "Yes";
        } else {
            returnedString += "No";
        }
        return returnedString;
    }

    public boolean equals(Home otherHome) {
        otherHome.username = this.username;
        return (this.address.equals(otherHome.address) && this.ownerName.equals(otherHome.ownerName)
                    && this.username.equals(otherHome.username)
                    && this.cleanlinessLevel == otherHome.cleanlinessLevel
                    && this.isScheduled == otherHome.isScheduled);
    }
}
