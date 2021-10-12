public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        this.val = d;
        left = right = null;
    }

    TreeNode(int d, TreeNode left, TreeNode right) {
        this.val = d;
        this.left = left;
        this.right = right;
    }
}
