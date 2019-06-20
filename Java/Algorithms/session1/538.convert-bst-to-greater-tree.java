/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 *
 * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 *
 * algorithms
 * Easy (50.84%)
 * Likes:    1251
 * Dislikes: 82
 * Total Accepted:    77.8K
 * Total Submissions: 153.1K
 * Testcase Example:  '[5,2,13]'
 *
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that
 * every key of the original BST is changed to the original key plus sum of all
 * keys greater than the original key in BST.
 *
 *
 * Example:
 *
 * Input: The root of a Binary Search Tree like this:
 * ⁠             5
 * ⁠           /   \
 * ⁠          2     13
 *
 * Output: The root of a Greater Tree like this:
 * ⁠            18
 * ⁠           /   \
 * ⁠         20     13
 *
 *
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

class Solution538 {
    private TreeNode pre;

    public TreeNode convertBST(TreeNode root) {
        inOrder(root);
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.right);
        if (pre != null) root.val += pre.val;
        pre = root;
        inOrder(root.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[5,2,13]");
        TreeWrapper.prettyPrintTree(treeNode);
        TreeWrapper.prettyPrintTree(new Solution538().convertBST(treeNode));
    }
}

