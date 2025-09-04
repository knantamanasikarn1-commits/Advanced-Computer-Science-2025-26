public class StudentTester {
    
    public static void main(String[] args) {
        Student topStudent = new Student("Kai", 15, 4.0, true);
        System.out.println(topStudent.getName());
        System.out.println(topStudent);
        topStudent.setAge(16);
    }

}
