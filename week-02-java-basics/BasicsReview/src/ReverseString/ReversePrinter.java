package ReverseString;
import java.util.Scanner;
public class ReversePrinter {
    public static void main (String[]args){

    Scanner eingabe= new Scanner(System.in);
    System.out.println("write any word!");
     String word = eingabe.next();
        char[] reversedArray = new char[word.length()];
     for(int i=1; i<=word.length(); i++){
        // System.out.print(word.charAt((word.length()-i)));
         reversedArray[i-1]= word.charAt(word.length()-i);
     }
     System.out.println(reversedArray);
    }
}
