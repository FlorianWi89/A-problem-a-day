class Solution {

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }




    public int maxDepth(TreeNode root) {
        int rootDepth=1;
        if(root != null)
            return 0;

        int rightST = maxDepth(root.right);
        int leftST = maxDepth(root.left);

        int max = Math.max(rightST, leftST);

        return max+rootDepth;
    }
}