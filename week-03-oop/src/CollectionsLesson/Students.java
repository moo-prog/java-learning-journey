package CollectionsLesson;
import java.util.ArrayList;
public class Students {
    public static void main (String [] args){
        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Ahmed");
        studentsList.add("Sara");
        studentsList.add("roan");
        studentsList.add("Ali");
        studentsList.add("Malak");
        for(String name : studentsList){
            System.out.print(name+", ");

        }
        System.out.println();
        studentsList.remove("Ali");
        for(String name : studentsList){
            System.out.print(name+", ");

        }

    }
}
