import java.util.ArrayList;

public class StudentAnswerSheet {

    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.testScore = 0.0;
        this.name = name;
        this.answers = answers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (answers == null) {
            throw new IllegalArgumentException("Answers is null.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Key is null.");
        }
        double grade = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals("?")) {
                continue;
            }
            if (answers.get(i).equals(key.get(i))) {
                grade += 1;
            } else {
                grade -= 0.25;
            }
        }
        return grade;
    }

}