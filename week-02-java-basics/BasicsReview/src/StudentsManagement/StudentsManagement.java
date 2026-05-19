package sunday;

public class StudentsManagement {

    public  static void printStudent(String name, int age, double mid, double finalGrade, double attendance){
        System.out.println(name+ age +mid+finalGrade+ attendance);
    }
    public static double calculateTotal(double mid, double finalGrade, double attendance) {
        return mid+finalGrade+attendance;
    }
    public static boolean checkPassed(double mid, double finalGrade, double attendance) {
        double total = mid + finalGrade + attendance;
        return total > 60;}
    public static void main(String[]args){
            // ---- the frist student
            String first1name = "anna";
            int first1age = 20;
            double frist1mid = 25.0;
            double frist1inalGrade = 40.0;
            double frist1attendance = 8.5;

            // ---- the second student
            String secondName = "hall";
            int secondAge = 22;
            double secondMid = 15.0;
            double secondFinalGrade = 30.0;
            double secondAttendance = 7.0;

            // ---- the third student
            String thirdName = "romio";
            int thirdAge = 21;
            double thirdMid = 28.0;
            double thirdFinalGrade = 52.0;
            double thirdAttendance = 9.5;

        printStudent(first1name, first1age, frist1mid, frist1inalGrade, frist1attendance);
        double total1 = calculateTotal(frist1mid, frist1inalGrade, frist1attendance);
        System.out.println("Total: " + total1 + " | Passed: " + checkPassed(frist1mid, frist1inalGrade, frist1attendance));

        System.out.println("----------------------------------------");

        // عمليات الطالب الثاني
        printStudent(secondName, secondAge, secondMid, secondFinalGrade, secondAttendance);
        double total2 = calculateTotal(secondMid, secondFinalGrade, secondAttendance);
        System.out.println("Total: " + total2 + " | Passed: " + checkPassed(secondMid, secondFinalGrade, secondAttendance));

        System.out.println("----------------------------------------");

        printStudent(thirdName, thirdAge, thirdMid, thirdFinalGrade, thirdAttendance);
        double total3 = calculateTotal(thirdMid, thirdFinalGrade, thirdAttendance);
        System.out.println("Total: " + total3 + " | Passed: " + checkPassed(thirdMid, thirdFinalGrade, thirdAttendance));
    }
}
