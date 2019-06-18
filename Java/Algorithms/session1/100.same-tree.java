/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 *
 * https://leetcode.com/problems/same-tree/description/
 *
 * algorithms
 * Easy (49.99%)
 * Likes:    1117
 * Dislikes: 34
 * Total Accepted:    376.2K
 * Total Submissions: 752.5K
 * Testcase Example:  '[1,2,3]\n[1,2,3]'
 *
 * Given two binary trees, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 * 
 * Example 1:
 * 
 * 
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   3     2   3
 * 
 * ⁠       [1,2,3],   [1,2,3]
 * 
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:     1         1
 * ⁠         /           \
 * ⁠        2             2
 * 
 * ⁠       [1,2],     [1,null,2]
 * 
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * 
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   1     1   2
 * 
 * ⁠       [1,2,1],   [1,1,2]
 * 
 * Output: false
 * 
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


class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = TreeWrapper.stringToTreeNode("[1,2,3]");
        TreeNode treeNode2 = TreeWrapper.stringToTreeNode("[1,2,3]");
        TreeNode treeNode3 = TreeWrapper.stringToTreeNode("[1,2]");
        TreeNode treeNode4 = TreeWrapper.stringToTreeNode("[1,null,2]");
        TreeNode treeNode5 = TreeWrapper.stringToTreeNode("[1,2,1]");
        TreeNode treeNode6 = TreeWrapper.stringToTreeNode("[1,1,2]");
        TreeWrapper.prettyPrintTree(treeNode1);
        TreeWrapper.prettyPrintTree(treeNode2);
        System.out.println(new Solution100().isSameTree(treeNode1, treeNode2));
        TreeWrapper.prettyPrintTree(treeNode3);
        TreeWrapper.prettyPrintTree(treeNode4);
        System.out.println(new Solution100().isSameTree(treeNode3, treeNode4));
        TreeWrapper.prettyPrintTree(treeNode5);
        TreeWrapper.prettyPrintTree(treeNode6);
        System.out.println(new Solution100().isSameTree(treeNode5, treeNode6));
    }
}