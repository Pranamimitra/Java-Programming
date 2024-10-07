import java.util.Arrays;

public class A {

    public static int[] findSubarrayWithLeastSum(int[] arr, int k) {
        int n = arr.length;

        // Initialize the minimum sum and the starting index of the subarray
        int minSum = Integer.MAX_VALUE;
        int minStartIndex = 0;

        // Compute the sum of the first window of size k
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // Initial window sum
        minSum = currentSum;
        minStartIndex = 0;

        // Slide the window over the rest of the array
        for (int i = k; i < n; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];

            if (currentSum < minSum) {
                minSum = currentSum;
                minStartIndex = i - k + 1;
            }
        }

        // Extract the subarray with the smallest sum
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[minStartIndex + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 8, 2, 2, 7, 4};
        int k = 3;

        int[] result = findSubarrayWithLeastSum(arr, k);
        System.out.println("Subarray with the least sum of length " + k + ": " + Arrays.toString(result));
    }
}

