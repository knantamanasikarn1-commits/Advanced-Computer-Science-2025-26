public class HubTester {
    public static void main(String[] args) {
        // Exception Test: Student with null name
        try {
            Student student = new Student(null, "123", "kai@gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student with blank name
        try {
            Student student = new Student("", "123", "kai@gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }
        
        // Exception Test: Student with null password
        try {
            Student student = new Student("Kai", null, "kai@gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }
        
        // Exception Test: Student with blank password
        try {
            Student student = new Student("Kai", null, "kai@gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }
        
        // Exception Test: Student with null email
        try {
            Student student = new Student("Kai", "123", null);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student with blank email
        try {
            Student student = new Student("Kai", "123", "");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student email no @
        try {
            Student student = new Student("Kai", "123", "kai.gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student email no .
        try {
            Student student = new Student("Kai", "123", "kai@gmail");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student name has @
        try {
            Student student = new Student("Kai@", "123", "kai.nant@gmail.com");
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student name exists already
        try {
            Student student1 = new Student("P1", "123", "kai.nant@gmail.com");
            Student student2 = new Student("P1", "123", "kai.nant@gmail.com");
            System.out.println(student1);
            System.out.println(student2);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student change name to null
        try {
            Student student = new Student("P2", "123", "kai.nant@gmail.com");
            student.changeName(null);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student change name to blank
        try {
            Student student = new Student("P3", "123", "kai.nant@gmail.com");
            student.changeName("");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student change name included @
        try {
            Student student = new Student("P4", "123", "kai.nant@gmail.com");
            student.changeName("hey@");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Student change name already exists
        try {
            Student student = new Student("P5", "123", "kai.nant@gmail.com");
            student.changeName("P4");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student with null name
        try {
            Hub hub = new Hub();
            hub.registerStudent(null, "123", "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student with blank name
        try {
            Hub hub = new Hub();
            hub.registerStudent("", "123", "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student with null password
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", null, "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student with blank password
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", "", "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student with null email
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", "123", null);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student; email no @
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", "123", "kai.nant");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student; email no .
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", "123", "kai@gmail");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student; name in rejectAt has @
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai@", "123", "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub register student; ensureStudentDoesNotExist but student name exists
        try {
            Hub hub = new Hub();
            hub.registerStudent("P6", "123", "kai.nant@gmail.com");
            hub.registerStudent("P6", "123", "kai.nant@gmail.com");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Hub register student; no exist; find index bad storage not triggerable
        // Hub register student; ensure capacity; bad storage not triggerable

        // Exception Test: Hub login student with null username
        try {
            Hub hub = new Hub();
            hub.registerStudent("P7", "123", "kai.nant@gmail.com");
            hub.loginStudent(null, "123");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub login student with blank username
        try {
            Hub hub = new Hub();
            hub.registerStudent("P8", "123", "kai.nant@gmail.com");
            hub.loginStudent("", "123");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub login student with null password
        try {
            Hub hub = new Hub();
            hub.registerStudent("P9", "123", "kai.nant@gmail.com");
            hub.loginStudent("P9", null);
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub login student with blank password
        try {
            Hub hub = new Hub();
            hub.registerStudent("P10", "123", "kai.nant@gmail.com");
            hub.loginStudent("P10", "");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub login student; find index is negative
        try {
            Hub hub = new Hub();
            hub.registerStudent("Kai", "123", "kai.nant@gmail.com");
            hub.loginStudent("Jeff", "123");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }

        // Exception Test: Hub login student with wrong password
        try {
            Hub hub = new Hub();
            hub.registerStudent("P11", "123", "kai.nant@gmail.com");
            hub.loginStudent("P11", "12");
        } catch (Exception e) {
            System.out.println("The following error is intentional:");
            System.out.println(e.toString());
        }
        
    }
}
