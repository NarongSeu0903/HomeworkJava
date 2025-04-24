import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    private static int wordCount(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    private static int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
    public static void main(String[] args) {
        String sentence = "Hello world, this is Java!";
        int count = wordCount(sentence);
        Scanner sc = new Scanner(System.in);
        System.out.println("Typing of word: " +count);
        String wordTyping = sc.nextLine();
        System.out.println("Word count: " + wordTyping);
    }
}
