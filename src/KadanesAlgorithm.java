class Solution {

    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        // Initialize current max (Cmax) and global max (max)
        int Cmax = arr[0];  // Start with the first element as the initial maximum
        int max = arr[0];   // Start with the first element as the global maximum

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update Cmax: either start a new subarray or extend the current subarray
            Cmax = Math.max(arr[i], Cmax + arr[i]);
            // Update the global maximum if needed
            max = Math.max(max, Cmax);
        }

        return max;  // Return the global maximum sum found
    }
}

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Max Subarray Sum (Example 1): " + solution.maxSubarraySum(arr1)); // Output: 11

        // Test case 2
        int[] arr2 = {-2, -4};
        System.out.println("Max Subarray Sum (Example 2): " + solution.maxSubarraySum(arr2)); // Output: -2
    }
}
