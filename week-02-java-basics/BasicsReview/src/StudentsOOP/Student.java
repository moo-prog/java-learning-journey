package StudentsOOP;

public class Student {
        private String name;
        private int age;
        private double midGrade;
        private double finalGrade;
        private double attendance;

        public Student( String name, int age, double midGrade, double finalGrade, double attendance){
            this.name= name;
            setAge(age);//to be sure that the age between 0 and 100
            this.midGrade= midGrade;
            this.finalGrade =finalGrade;
            this.attendance= attendance;
        }

        public String getName(){
            return  name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getAge(){
            return  age;
        }
        public void setAge(int age){
            if(age>0&&age<100){
                this.age= age;
            }else{
                System.out.println("Invalid age! Age must be between 1 and 99");
            }
        }
        public double getMidGrade() {
            return midGrade;
        }

        public void setMidGrade(double midGrade) {
            if (midGrade >= 0 && midGrade <= 30) {
                this.midGrade = midGrade;
            } else {
                System.out.println("Mid grade must be 0-30");
            }
        }

        public double getFinalGrade() {
            return finalGrade;
        }

        public void setFinalGrade(double finalGrade) {
            this.finalGrade = finalGrade;
        }

        public double getAttendance() {
            return attendance;
        }

        public void setAttendance(double attendance) {
            this.attendance = attendance;
        }
        public void printInfo() {
            System.out.println("================================");
            System.out.println("Student Name : " + name);
            System.out.println("Student Age  : " + age);
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
