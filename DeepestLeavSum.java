import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavSum {

    // given a binary tree, return the sum of the nodes ( leaves) on the deepest
    // level, Runtime is O(N)

    public static int deepestLeaveSum(TreeNode root) {
        // initialize a level sum counter
        int level_sum = 0;

        // queue to store all nodes of a level
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        // as long as there are nodes left push them to q
        while (!queue.isEmpty()) {
            // on every level we reset the level sum , except for the last level
            level_sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level_sum += current.val;

                if (current.right != null)
                    queue.add(current.right);
                if (current.left != null)
                    queue.add(current.left);
            }
        }
        return level_sum;

    }
}
