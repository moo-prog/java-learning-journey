package WordCounterProject;
import java.util.Scanner;
public class WordCounter {
    public static void main (String [] args){
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String[] words = eingabe.nextLine().split(" ");
        System.out.println("Number of words: " + words.length);
         for (int i=0 ; i< words.length; i++){
             for(int j= i+1 ; j<words.length; j++){
                 if (words[i].equals(words[j])){
                     System.out.println(words[i]);
                     break;
                 }
             }

         }
    }
}
