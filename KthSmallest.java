import java.util.Stack;
// Given the root of a binary search tree, and an integer k, 
// return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

public class KthSmallest {
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        // Idea: traverse inorder, pop the last stack.size-k items
        // O(N) Time and O(N) Space
        public int kthSmallest(TreeNode root, int k) {
            if (root == null)
                return 0;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            inOrderTravers(root, stack);

            int pop = stack.size() - k;
            while (pop != 0) {
                stack.pop();
                pop--;
            }
            return stack.peek().val;
        }

        // simple inorder traversion of the tree
        public void inOrderTravers(TreeNode currentNode, Stack<TreeNode> stack) {
            if (currentNode != null) {
                inOrderTravers(currentNode.left, stack);
                stack.add(currentNode);
                inOrderTravers(currentNode.right, stack);
            }
        }
    }
}