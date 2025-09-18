public class Student {
    private String name;
    private String id;
    private int grade;
    private Student latestOpp;
    private Student recentFriend;

    public Student getLatestOpp() {
        return latestOpp;
    }

    public void setLatestOpp(Student latestOpp) {
        this.latestOpp = latestOpp;
    }

    public Student getRecentFriend() {
        return recentFriend;
    }

    public void setRecentFriend(Student recentFriend) {
        this.recentFriend = recentFriend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String toString() {
        String returnedString = "";
        returnedString += name + " is ";
        if (grade == 8 || grade == 11) {
            returnedString += "an ";
        } else {
            returnedString += "a ";
        }
        returnedString += grade;
        if (grade == 1) {
            returnedString += "st";
        } else if (grade == 2) {
            returnedString += "nd";
        } else if (grade == 3) {
            returnedString += "rd";
        } else {
            returnedString += "th";
        }
        returnedString += " grade student. Their id is " + id + ".";
        return returnedString;
    }

    public boolean equals(Student other) {
        if (! name.equals(other.name)) {
            return false;
        }
        if (! id.equals(other.id)) {
            return false;
        }
        if (grade != other.grade) {
            return false;
        }
        return true;
    }

    public String generateId() {
        String returnedString = "";
        for (int i = 0; i < 3; i++) {
            returnedString += (int) (Math.random() * 10);
        }
        // returnedString += (int) (Math.random() * 800 + 100);
        returnedString += "-";
        for (int i = 0; i < 4; i++) {
            returnedString += (int) (Math.random() * 10);
        }
        return returnedString;
    }

    public String vibeCheck(Student other) {
        if (this.latestOpp.equals(other.latestOpp)) {
            recentFriend = other;
            other.recentFriend = this;
            return this.name + " and " + other.name + " are now friends! " + 
                "They both dislike " + this.latestOpp.name + ".";
        }
        return this.name + " dislikes " + this.latestOpp.name + ", but " + other.name +
            "dislikes " + other.latestOpp.name + ".";
    }

}
