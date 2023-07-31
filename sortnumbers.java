import java.util.Arrays;
import java.util.Scanner;

public class sortnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking 3 inputs at once
        System.out.println("Enter 3 numbers separated by spaces: ");
        String[] inputNumbers = input.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // Sorting the numbers in decreasing order
        Arrays.sort(numbers);
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = numbers[numbers.length - i - 1];
        }

        // Displaying the sorted numbers
        System.out.print("The numbers in decreasing order are: ");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
}
}
}