public class Check_Tree_Balanced {

    class Node {
        int val;
        Node left, right;

        Node(int v) {
            this.val = v;
            right = left = null;
        }
    }

    class Height {
        int h = 0;
    }

    class BinTree {
        Node root;

        // time of O(N)
        boolean isBalanced(Node root, Height height) {

            if (root == null)
                return true;

            Height leftHeight = new Height();
            Height rightHeight = new Height();

            boolean left = isBalanced(root.left, leftHeight);
            boolean right = isBalanced(root.right, rightHeight);

            int leftH = leftHeight.h;
            int rightH = rightHeight.h;

            height.h = (leftH > rightH ? leftH : rightH) + 1;

            if (Math.abs(leftH - rightH) >= 2)
                return false;

            else {
                return left && right;
            }
        }
    }
}
