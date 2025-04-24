import java.util.Arrays;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int count = wordCount(sentence);
        System.out.println("Word count: " + count);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] sorted = sort(nums);
        System.out.print("Sorted array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
