import java.util.HashMap;

public class GoodPairs {
    // Given an array of integers nums, return the number of good pairs.
    // A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    // O(N^N) time
    public static int goodPairs_naive(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    // we count occurences of numbers in nums
    // then this is simple combinatorics
    public static int goodPairs_optimal(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        for (Integer val : map.values())
            count += val * (val - 1) / 2;

        return count;

    }
}
