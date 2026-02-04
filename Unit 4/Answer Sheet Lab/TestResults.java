import java.util.ArrayList;

public class TestResults {

    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Key or submissions is null.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet submission : submissions) {
            submission.setTestScore(submission.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }
        String bestStudent = submissions.get(0).getName();
        double bestScore = submissions.get(0).getGrade(answerKey);
        for (StudentAnswerSheet submission : submissions) {
            double score = submission.getGrade(answerKey);
            if (score > bestScore) {
                bestStudent = submission.getName();
                bestScore = score;
            }
        }
        return bestStudent;
    }

}
