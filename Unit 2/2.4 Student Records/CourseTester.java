public class CourseTester {
    public static void main(String[] args) {
        int[] anaScores = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("Ana", anaScores);
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95]"));
        System.out.println(ana.getAverage(0, 3) == 91.25);
        System.out.println(ana.getTestScore(1) == 89);
        System.out.println(ana.hasImproved());

        int[] bobScores = {50, 60, 80, 90, 95};
        StudentRecord bob = new StudentRecord("Bob", bobScores);
        System.out.println(bob.getAverage(0, bobScores.length - 1));
        System.out.println(bob.hasImproved());
        System.out.println(bob.getFinalAverage());

        StudentRecord[] classRecords = {ana, bob};
        Course newCourse = new Course("Honors Precalculus", classRecords);
        System.out.println(newCourse.toString());
        System.out.println(newCourse.findBestStudent());
    }
}
