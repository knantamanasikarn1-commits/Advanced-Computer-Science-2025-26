public class Student {
    
    private String name;
    private int age;
    private double gpa;
    private boolean inHonorRoll;

    public Student(String name, int age, double gpa, boolean inHonorRoll) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.inHonorRoll = inHonorRoll;
    }

    public Student(String name) {
        this.name = name;
        this.age = 12;
        this.gpa = 3.2;
        this.inHonorRoll = false;
    }

    public double study(int hours) {
        this.gpa += hours / 100;
        return gpa;
    }
    
    // setter

    public void setAge(int newAge) {
        this.age = newAge;
    }

    // getter

    public String getName() {
        return this.name;
    }

}
