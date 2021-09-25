import java.util.Stack;

public class InvertBinTree {

    // Given the root of a binary tree, invert the tree, and return its root.

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

        public TreeNode invertBinaryTree(TreeNode root) {

            if (root == null) {
                return null;
            }

            // the idea is to use a stack to keep track of all nodes, which
            // we have to swap
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.empty()) {
                // stack uses LIFO system so we can get the last inserted item with pop()
                TreeNode currentNode = stack.pop();
                // swapping the nodes
                TreeNode leftNode = currentNode.left;
                currentNode.left = currentNode.right;
                currentNode.right = leftNode;

                // if there are any children left, push them to the stack and repeat
                if (currentNode.left != null) {
                    stack.push(currentNode.left);
                }
                if (currentNode.right != null) {
                    stack.push(currentNode.right);
                }
            }
            return root;
        }
    }
}