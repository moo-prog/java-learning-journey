import java.util.Arrays;
import java.util.Random;

public class BubbleSortChallenge {
    static int[] numbers = new int[10];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Bereich 1 bis 100
        }
        for(int num : numbers){
            System.out.print(num + ",");
        }
        System.out.println();

        bubbleSort(numbers);
    }

        public static void bubbleSort(int[] array) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {

                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }

                }
            }

            for (int num : numbers) {
                System.out.print(num + ",");
            }
        }}