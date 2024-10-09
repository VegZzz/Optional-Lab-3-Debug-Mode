package operation;

import java.util.Arrays;

public class StepOperationDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};  // Set a breakpoint here and Step Over

        double avg = calculateAverage(numbers);  // Step Into this method
        System.out.println("Average: " + avg);  // Step Over

        Arrays.sort(numbers);   // Force Step Into: step into the Arrays.sort() standard library call

        int max = findMax(numbers);  // Force Step Over this method
        System.out.println("Max value: " + max);  // Step Over
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;  // Set a breakpoint here
        for (int num : arr) {
            sum += num;  // Step Over each iteration
        }
        return (double) sum / arr.length;  // Step Out after this line
    }

    public static int findMax(int[] arr) {
        int max = arr[0];  // Set a breakpoint here
        for (int num : arr) {
            if (num > max) {
                max = num;  // Step Over each iteration
            }
        }
        return max;  // Step Out after this line
    }
}