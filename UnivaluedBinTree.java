public class UnivaluedBinTree {

    // A binary tree is uni-valued if every node in the tree has the same value.
    // Given the root of a binary tree, return true if the given tree is uni-valued,
    // or false otherwise.

    // just a bit of practise how to traverse a tree and check for something
    public static boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        return checker(root, value);
    }

    public static boolean checker(TreeNode node, int val) {
        if (node == null)
            return true;
        if (node.val != val)
            return false;

        return checker(node.left, val) && checker(node.left, val);
    }
}
