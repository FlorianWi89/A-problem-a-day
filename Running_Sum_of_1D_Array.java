// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

class Running_Sum_of_1D_Array {
    public static int[] runningSum(int[] nums) {

        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];
            nums[i] = currentSum;
        }
        return nums;

    }
}