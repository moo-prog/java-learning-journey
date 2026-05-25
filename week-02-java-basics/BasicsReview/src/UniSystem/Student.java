package UniSystem;

public class Student extends Person{
    private int studentId;
    private String major;
    public Student(String name, int age, int studentId, String major){
        super(name,age);
        this.studentId = studentId;
        this.major = major;
    }
    public void Study(){
        System.out.println("ID: " + studentId + " | " + getName() + " is " + getAge() + " years old and studies " + major);
    }
}
