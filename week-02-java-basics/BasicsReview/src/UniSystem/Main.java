package UniSystem;

public class Main {
    public  static void main() {
        Student s1 = new Student("Ahmed", 20, 101, "Computer Science");
        Teacher t1 = new Teacher("Dr. Mohamed", 45, 202, "Java Programming", 4500.0);
        s1.introduce();
        s1.Study();
        System.out.println("----------------------------------------");
        t1.introduce();
        t1.teach();
    }
}
