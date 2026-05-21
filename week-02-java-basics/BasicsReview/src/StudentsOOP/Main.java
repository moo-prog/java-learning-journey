package StudentsOOP;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmed", 20, 25.0, 40.0, 8.5);
        Student student2 = new Student("Mohamed", 22, 15.0, 30.0, 7.0);
        Student student3 = new Student("Sara", 21, 28.0, 52.0, 9.5);
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student1.setAge(150);
        student1.setMidGrade(35);


    }
}
