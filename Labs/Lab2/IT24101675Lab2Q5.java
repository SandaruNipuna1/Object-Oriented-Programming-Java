import java.util.ArrayList;
import java.util.Scanner;

public class IT24101675Lab2Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //accepts 5 words from the user and store them in an array
        String[] words = new String[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter word " + (i + 1) + " of 5: ");
            words[i] = scn.nextLine();
        }

        //Find the longest word(s) from the array
        ArrayList<String> longestWords = new ArrayList<>();
        int maxLength = 0;
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
                longestWords.add(word);
            } else if(word.length() == maxLength) {
                longestWords.add(word);
            }
        }
        //print the longest word(s) from the array
        System.out.println("The longest word(s) from the array is: ");
        for(String word : longestWords) {
            System.out.println(word);
        }

        //Calculate the total number of characters in all the words combined
        int totalchars = 0;
        for (String word : words) {
            totalchars += word.length();
        }
        System.out.println("The total number of characters in the array is: " + totalchars);

        //Identify the words with an even number of characters
        System.out.println("Word(s) with an even number of characters: ");
        for(String word : words) {
            if(word.length() % 2 == 0) {
                //print the words with an even number of characters
                System.out.println(word);
            }
        }
    }
}
