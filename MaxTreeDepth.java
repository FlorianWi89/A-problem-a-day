class Solution {

    public int maxDepth(TreeNode root) {
        int rootDepth = 1;
        if (root == null)
            return 0;

        int rightST = maxDepth(root.right);
        int leftST = maxDepth(root.left);

        int max = Math.max(rightST, leftST);

        return max + rootDepth;
    }
}
