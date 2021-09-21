
# Given the root of a binary tree, return the inorder traversal of its nodes' values.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def inOrderTraverse(root):
    nodes = []

    def dfs(node):
        if not node:
            return

        dfs(node.left)
        nodes.append(node.val)
        dfs(node.rigth)

    dfs(root)
    return nodes
