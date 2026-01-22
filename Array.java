import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Single Dimensional Array
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elments: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < n; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / n;

        // Manual Sorting (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Output
        System.out.println("\n----- Data Analysis Result -----");
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Multi Dimensional Array
        System.out.println("\n\n----- 2D Array -----");
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exception Handling
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(numbers[n]); // Error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds");
        }
    }
}
