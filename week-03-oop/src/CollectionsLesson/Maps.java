package CollectionsLesson;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String [] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Samer", 1);
        students.put("Ali", 5);
        students.put("Mohammed", 2);
        students.put("sara", 3);
        System.out.println("Ali's grade is: " + students.get("Ali"));
        students.put("sara", 4);
        System.out.println(students);
        System.out.println("\n--- All Students and Grades ---");

            // Loop through the HashMap using entrySet to access both Keys and Values in each iteration
            for (Map.Entry<String, Integer> entry : students.entrySet()) {
                // Print each student's name (Key) and their respective grade (Value)
                System.out.println("Student: " + entry.getKey() + " | Grade: " + entry.getValue());
            }
        }
    }
