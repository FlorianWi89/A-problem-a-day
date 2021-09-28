public class MaximumSubarray {

    // approach 1: using DP
    public static int maxSubArrDP(int[] arr) {
        int n = arr.length;
        int[] sums = new int[n];
        sums[0] = arr[0];

        int currMax = sums[0];

        for (int i = 0; i < n; i++) {
            if (sums[i - 1] > 0) {
                sums[i] = arr[i] + sums[i - 1];
                currMax = Math.max(currMax, sums[i]);
            } else {
                sums[i] = arr[i];
                currMax = Math.max(currMax, sums[i]);
            }
        }
        return currMax;
    }

    // approach 2: kadanes algorithm
    public static int maxSubArrKadane(int[] arr) {
        int n = arr.length;
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;

    }

}
