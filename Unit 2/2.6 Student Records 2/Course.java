public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    // getters
    // to-do: implement getters

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    // to-do: implement setters

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    // to-do: implement toString

    public String toString() {
        String returnedString = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            returnedString += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return returnedString;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent

    public String findBestStudent() {
        String bestStudentName = "Kai";
        double bestScore = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            StudentRecord currentStudent = enrolledStudents[i];
            double currentStudentScore = currentStudent.getFinalAverage();
            if (currentStudent.getFinalAverage() > bestScore) {
                bestScore = currentStudentScore;
                bestStudentName = currentStudent.getName();
            }
        }
        return bestStudentName;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage

    public double calculateTestAverage(int testNum) {
        int scoreSum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            scoreSum += enrolledStudents[i].getTestScore(testNum);
        }
        return (double) scoreSum / enrolledStudents.length;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                continue;
            }
            if (enrolledStudents[i].getName().equals(student.getName())) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int enrolledStudentCount = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                enrolledStudentCount += 1;
            }
        }
        return enrolledStudentCount;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        if (sizeIncrease == 0) {
            return;
        }
        StudentRecord[] newStudentArray = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newStudentArray[i] = enrolledStudents[i];
        }
        enrolledStudents = newStudentArray;
    }

}
