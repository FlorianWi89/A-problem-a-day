import java.util.LinkedList;

public class RangeSumOfBST {

    // BFS approach
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode currNode = queue.poll();

                if (currNode.val >= low && currNode.val <= high)
                    sum += currNode.val;
                if (currNode.right != null)
                    queue.add(currNode.right);
                if (currNode.left != null)
                    queue.add(currNode.left);
            }
        }
        return sum;
    }

    // recursive approach

    public int rangeSumBST_Recursive(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.val >= low && root.val <= high)
            sum += root.val;
        if (root.val > low)
            sum += rangeSumBST(root.left, low, high);
        if (root.val < high)
            sum += rangeSumBST(root.right, low, high);

        return sum;
    }

    // DFS approach

    int sum = 0;

    public int rangeSumBST_DFS(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }

    public void dfs(TreeNode node, int low, int high) {
        if (node == null)
            return;

        int currentVal = node.val;

        if (currentVal >= low && currentVal <= high)
            sum += currentVal;

        if (currentVal >= low)
            dfs(node.left, low, high);

        if (currentVal <= high)
            dfs(node.right, low, high);

    }
}
