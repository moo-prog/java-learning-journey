package UniSystem;

public class Teacher  extends Person{
    int teacherId;
    String subject;
    double salary;
    public Teacher(String name, int age, int teacherId, String subject, double salary){
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
        this.salary = salary;
    }
    public void teach(){
        System.out.println("Teacher ID: " + teacherId + " | " + getName() + " is " + getAge() + " years old, teaches " + subject + " and their salary is " + salary + "$");
    }
}
