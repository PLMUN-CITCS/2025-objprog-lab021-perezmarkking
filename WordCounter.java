import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0; // If the sentence is empty or only spaces, return 0
        }
        String[] words = sentence.trim().split("\\s+"); // Split by spaces
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("The number of words in the sentence is: " + wordCount);
    }
}
