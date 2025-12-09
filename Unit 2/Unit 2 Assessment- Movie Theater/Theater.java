public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }
    
    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newMembers = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newMembers[i] = registeredMembers[i];
        }
        this.registeredMembers = newMembers;
    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            increaseCapacity();
            registeredMembers[registeredMembers.length - 1] = member;
        } else {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    return;
                }
            }
        }
    }

    public String toString() {
        String returnedString = "== " + this.theaterName + " ==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return returnedString;
            }
            returnedString += (i + 1) + ".) " + registeredMembers[i].toString() + "\n";
        }
        return returnedString;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (member.equals(registeredMembers[i])) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }

}
