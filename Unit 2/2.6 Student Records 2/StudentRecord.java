public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters
    // to-do: implement getTestScore

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    // to-do: implement toString

    public String toString() {
        return name + "'s scores: " + getIntegerArray(scores);
    }

    private static String getIntegerArray(int[] array) {
        String returnedString = "[";
        for (int i = 0; i < array.length - 1; i++) {
            returnedString += array[i] + ", ";
        }
        returnedString += array[array.length - 1] + "]";
        return returnedString;
    }

    public boolean equals(StudentRecord other) {
        boolean namesEqual = (this.name.equals(other.name));
        boolean scoresEqual = true;
        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i] != other.scores[i]) {
                scoresEqual = false;
                break;
            }
        }
        return (namesEqual && scoresEqual);
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int scoreSum = 0;
        for (int i = first; i <= last; i++) {
            scoreSum += scores[i];
        }
        return (double) scoreSum / (last - first + 1);
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 0 || testNumber >= scores.length) {
            return -1;
        }
        return scores[testNumber];
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        boolean isImproved = true;
        int indexCheck = 1;
        while (isImproved && indexCheck < scores.length) {
            if (scores[indexCheck] < scores[indexCheck - 1]) {
                isImproved = false;
            }
            indexCheck += 1;
        }
        return isImproved;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        int minAvgIndex = 0;
        if (hasImproved()) {
            minAvgIndex = scores.length / 2;
        }
        return getAverage(minAvgIndex, scores.length - 1);
    }

}