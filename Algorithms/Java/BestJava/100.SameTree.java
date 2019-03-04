package BestJava;
/*
100. Same Tree

Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true

Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false

Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
 */

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

/**
 * Definition for a binary tree node.
 * public class Utils.TreeNode {
 * int val;
 * Utils.TreeNode left;
 * Utils.TreeNode right;
 * Utils.TreeNode(int x) { val = x; }
 * }
 */
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }

    public static void main(String[] args) {
        TreeNode node1 = TreeWrapper.stringToTreeNode("[1,2,3]");
        TreeWrapper.prettyPrintTree(node1);
        TreeNode node2 = TreeWrapper.stringToTreeNode("[1,2,3]");
        TreeWrapper.prettyPrintTree(node2);
        System.out.println(new Solution100().isSameTree(node1, node2));

        TreeNode node3 = TreeWrapper.stringToTreeNode("[1,2]");
        TreeWrapper.prettyPrintTree(node3);
        TreeNode node4 = TreeWrapper.stringToTreeNode("[1,null,2]");
        TreeWrapper.prettyPrintTree(node4);
        System.out.println(new Solution100().isSameTree(node3, node4));
    }
}