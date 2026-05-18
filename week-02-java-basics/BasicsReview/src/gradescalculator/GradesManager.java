package gradescalculator;

public class GradesManager {
    public static void main (String[] args){
        int [] grades =  {70,50,100,60};
        System.out.println("Average: " + calculateAverage(grades));
        System.out.println("min: " + findMaxGrade(grades));
        System.out.println("max: " + findMinGrade(grades));

    }
    public static double calculateAverage(int[] grades) {
        double plus = 0;
        for (int i = 0; i < grades.length; i++) {
            plus = grades[i] + plus;

        }
        return plus/grades.length;
    }
    public static int findMaxGrade(int[] grades){
        int max=grades[0];
        for(int i=1; i<grades.length;i++){

            if(grades[i]>max){
                max=grades[i];
            }
        }
        return max;
    }
    public static int findMinGrade(int[] grades){
        int min =grades[0];
        for(int i=1; i<grades.length;i++){

            if(grades[i]< min){
                min =grades[i];
            }
        }
        return min;
    }

}
