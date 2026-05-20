package StudentsOOP;

public class Student {
        String name;
        int age;
        double midGrade;
        double finalGrade;
        double attendance;

        void printInfo() {
            System.out.println("================================");
            System.out.println("Student Name : " + name);
            System.out.println("Student Age  : " + age);
            System.out.println("Mid Term     : " + midGrade);
            System.out.println("Final Grade  : " + finalGrade);
            System.out.println("Attendance   : " + attendance);
            System.out.println("Total Grade  : " + calculateTotal());
            System.out.println("Status       : " + (isPassed() ? "Passed" : "Failed"));
            System.out.println("================================");
        }

        double calculateTotal() {
            return midGrade + finalGrade + attendance;
        }

        boolean isPassed() {
            return calculateTotal() > 60;
        }
    }
