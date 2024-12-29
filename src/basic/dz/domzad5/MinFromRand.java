package basic.dz.domzad5;

import java.util.Random;

public class MinFromRand {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(3);
        int minValue = findMinimum(numbers);
        displayResult(numbers, minValue);
    }

    private static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }

    private static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    private static void displayResult(int[] numbers, int minValue) {
        System.out.println("Generated numbers: ");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("Minimum value: " + minValue);
    }
}
