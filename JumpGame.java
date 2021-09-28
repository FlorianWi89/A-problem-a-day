public class JumpGame {

    // You are given an integer array nums. You are initially positioned at the
    // array's first index,
    // and each element in the array represents your maximum jump length at that
    // position.

    // Return true if you can reach the last index, or false otherwise.

    public boolean canJump(int[] nums) {
        int n = nums.length;

        // bool array to keep track if it is possible to reach the target index with the
        // possible jumps
        boolean[] possible = new boolean[n];
        possible[n - 1] = true; // set last index to 1 true
        int last = n - 1, start = n - 2;

        while (start >= 0) {
            int jump = nums[start];
            // check if the target index is in range
            if (start + jump >= last) {
                possible[start] = true;
                last = start;
            }
            start--;
        }

        return possible[0];

    }
}
