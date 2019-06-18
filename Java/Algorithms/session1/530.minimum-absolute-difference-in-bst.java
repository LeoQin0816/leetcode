/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 *
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
 *
 * algorithms
 * Easy (50.43%)
 * Likes:    514
 * Dislikes: 35
 * Total Accepted:    58.9K
 * Total Submissions: 116.7K
 * Testcase Example:  '[1,null,3,2]'
 *
 * Given a binary search tree with non-negative values, find the minimum
 * absolute difference between values of any two nodes.
 *
 * Example:
 *
 *
 * Input:
 *
 * ⁠  1
 * ⁠   \
 * ⁠    3
 * ⁠   /
 * ⁠  2
 *
 * Output:
 * 1
 *
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and
 * 1 (or between 2 and 3).
 *
 *
 *
 *
 * Note: There are at least two nodes in this BST.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package session1;

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

class Solution530 {
    public int min = Integer.MAX_VALUE;
    TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        min(root);
        return min;
    }

    public void min(TreeNode root) {
        if (root == null) return;
        min(root.left);
        if (pre != null) min = Math.min(min, root.val - pre.val);
        pre = root;
        min(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[1,null,3,2]");
        TreeWrapper.prettyPrintTree(treeNode);
        System.out.println(new Solution530().getMinimumDifference(treeNode));
        TreeNode treeNode2 = TreeWrapper.stringToTreeNode("[236,104,701,null,227,null,911]");
        TreeWrapper.prettyPrintTree(treeNode2);
        System.out.println(new Solution530().getMinimumDifference(treeNode2));
    }
}

