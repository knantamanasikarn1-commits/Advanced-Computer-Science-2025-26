public class StudentTester {
    public static void main(String[] args) {

        // Initialize students

        Student student1 = new Student("Kai", 10);
        Student student2 = new Student("Ken", 8);
        Student student3 = new Student("Joshua");
        Student student4 = new Student("Alex");

        // To string for all students

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        // Checking getters and setters by increasing grade by 1 and to stringing them

        student1.setGrade(student1.getGrade() + 1);
        student2.setGrade(student2.getGrade() + 1);
        student3.setGrade(student3.getGrade() + 1);
        student4.setGrade(student4.getGrade() + 1);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());

        // Check equals for students

        System.out.println("Are student1 and student3 the same?: " + student1.equals(student3));
        System.out.println("Are student2 and student4 the same?: " + student2.equals(student4));

        // Vibecheck testing

        student1.setLatestOpp(student2);
        student3.setLatestOpp(student2);
        System.out.println(student1.vibeCheck(student3));

    }
}