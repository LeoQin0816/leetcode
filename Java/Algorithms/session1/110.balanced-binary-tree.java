/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 *
 * https://leetcode.com/problems/balanced-binary-tree/description/
 *
 * algorithms
 * Easy (40.95%)
 * Likes:    1217
 * Dislikes: 108
 * Total Accepted:    319.1K
 * Total Submissions: 779.4K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as:
 * 
 * 
 * a binary tree in which the depth of the two subtrees of every node never
 * differ by more than 1.
 * 
 * 
 * Example 1:
 * 
 * Given the following tree [3,9,20,null,null,15,7]:
 * 
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * Return true.
 * 
 * Example 2:
 * 
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 * 
 * 
 * ⁠      1
 * ⁠     / \
 * ⁠    2   2
 * ⁠   / \
 * ⁠  3   3
 * ⁠ / \
 * ⁠4   4
 * 
 * 
 * Return false.
 * 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package session1;

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

class Solution110 {
    private boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        helper(root);
        return flag;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left - right) > 1) flag = false;
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = TreeWrapper.stringToTreeNode("[3,9,20,null,null,15,7]");
        TreeNode treeNode2 = TreeWrapper.stringToTreeNode("[1,2,2,3,3,null,null,4,4]");
        TreeWrapper.prettyPrintTree(treeNode1);
        System.out.println(new Solution110().isBalanced(treeNode1));
        TreeWrapper.prettyPrintTree(treeNode2);
        System.out.println(new Solution110().isBalanced(treeNode2));
    }
}