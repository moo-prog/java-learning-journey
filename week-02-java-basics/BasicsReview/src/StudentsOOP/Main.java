package StudentsOOP;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "olaa";
        student1.age = 20;
        student1.midGrade = 25.0;
        student1.finalGrade = 40.0;
        student1.attendance = 8.5;

        Student student2 = new Student();
        student2.name = "anna";
        student2.age = 30;
        student2.midGrade = 65.0;
        student2.finalGrade = 40.0;
        student2.attendance = 6.5;

        student2.printInfo();
        student1.printInfo();

    }
}
