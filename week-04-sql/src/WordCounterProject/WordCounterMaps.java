package WordCounterProject;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class WordCounterMaps {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String[] words = eingabe.nextLine().split(" ");
        System.out.println("Number of words: " + words.length);

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();
            if (wordCountMap.containsKey(currentWord)) {
                wordCountMap.put(currentWord, wordCountMap.get(currentWord) + 1);// If the word already exists, increment its current count by 1
            } else {
                wordCountMap.put(currentWord, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
