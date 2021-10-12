public class Symmetric_Tree {

    // O(N) Time because every node is visited once
    // O(log N) or O(height) Space
    public boolean isSymmetric(TreeNode root) {
        return (root == null || checker(root, root));
    }

    // helper function that takes two nodes and compares them, recursively
    // check LST.right and RST.left and vica versa
    public boolean checker(TreeNode nodeA, TreeNode nodeB) {

        if (nodeA == null && nodeB == null)
            return true;

        if ((nodeA != null && nodeB != null) && (nodeA.val == nodeB.val)) {
            return (checker(nodeA.left, nodeB.right) && checker(nodeA.right, nodeB.left));
        }

        return false;
    }
}
