package fizzbuzzgame;
import java.util.Scanner;
public class FizzBuzz {
    public static void main (String[]args){
        Scanner eingabe= new Scanner(System.in);
        System.out.println("enter a number");
        int number= eingabe.nextInt();
        for(int i=0; i<number; i++){
            int newnumber=number-i;
            if(newnumber%3==0 && newnumber%5==0){
                System.out.println("FizzBuzz");
            }
            else if(newnumber%3==0){
                System.out.println("Fizz");
            }else  if(newnumber%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(newnumber);
            }
        }
    }
}
