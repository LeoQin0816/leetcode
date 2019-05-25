/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * algorithms
 * Easy (46.72%)
 * Likes:    719
 * Dislikes: 136
 * Total Accepted:    225.2K
 * Total Submissions: 482K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, return the bottom-up level order traversal of its
 * nodes' values. (ie, from left to right, level by level from leaf to root).
 * 
 * 
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 
 * return its bottom-up level order traversal as:
 * 
 * [
 * ⁠ [15,7],
 * ⁠ [9,20],
 * ⁠ [3]
 * ]
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
package Java;

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root==null) return res;
        queue.offer(root);
        while (queue.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
            }
            res.addFirst(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[3,9,20,null,null,15,7]");
        TreeWrapper.prettyPrintTree(treeNode);
        System.out.println(new Solution107().levelOrderBottom(treeNode));
    }
}