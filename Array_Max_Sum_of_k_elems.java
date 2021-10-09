public class Array_Max_Sum_of_k_elems {

    // this window sliding approach reduces time from O(N^2) to O(N)
    public static int windowSlidingSum(int[] arr, int arrLen, int k) {
        if (k > arrLen)
            return -1;

        int maxSum = 0;
        // calc the first window sum of length k
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        // move the window (add the next elem and subtract the last), compare the sums
        for (int i = k; i < arrLen; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

}
