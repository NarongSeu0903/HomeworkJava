import java.util.Arrays;

public class Homework {
    public static int wordCount(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
    public static void main(String[] args) {

        String sentence = "Hello world, this is Java!";
        int count = wordCount(sentence);
        System.out.println("Word count: " + count);

        int[] nums = {100, 400, 600, 8, 2};
        int[] sorted = sort(nums);
        System.out.print("Sorted array: ");
        for (int num : sorted) {
            System.out.println(num + "");
        }
    }
}
