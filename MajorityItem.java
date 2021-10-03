import java.util.HashMap;

public class MajorityItem {

    // naive Solution using a HashMap to track the occurences
    // expected Time O(N) and O(N) space
    public static int majorityElement(int[] nums) {
        int n = nums.length, index = 0, max = 0;
        if (n == 1)
            return nums[0];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > max) {
                max = map.get(nums[i]);
                index = nums[i];
            }
        }
        return index;
    }

    // famous boyer moore algo , O(N) Time and O(1) space
    public static int boyerMooreMajorityVote(int[] nums) {
        int major = nums[0], counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (counter == 0) {
                counter++;
                major = nums[i];
            } else if (major == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }
        return major;
    }
}
