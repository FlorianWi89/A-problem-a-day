import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class FindDuplicates {

    // Naive Solution with O(N) Time and almost O(N) Space
    public static List<Integer> findDuplicates(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        List<Integer> dups = new LinkedList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!seen[nums[i]]) {
                seen[nums[i]] = true;
            } else {
                dups.add(nums[i]);
            }
        }
        return dups;
    }

    // An other solution is to use the input array as memory for our already visited
    // numbers
    public static List<Integer> findDupsBetter(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                dups.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return dups;
    }

}
