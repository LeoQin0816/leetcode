package Java;
/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[3,9,20,null,null,15,7]");
        TreeWrapper.prettyPrintTree(treeNode);
        System.out.println(new Solution104().maxDepth(treeNode));
    }
}