/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 *
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 *
 * algorithms
 * Easy (46.68%)
 * Likes:    1376
 * Dislikes: 83
 * Total Accepted:    129.6K
 * Total Submissions: 277.7K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 *
 * Given a binary tree, you need to compute the length of the diameter of the
 * tree. The diameter of a binary tree is the length of the longest path
 * between any two nodes in a tree. This path may or may not pass through the
 * root.
 *
 *
 *
 * Example:
 * Given a binary tree
 *
 * ⁠         1
 * ⁠        / \
 * ⁠       2   3
 * ⁠      / \
 * ⁠     4   5
 *
 *
 *
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 *
 * Note:
 * The length of path between two nodes is represented by the number of edges
 * between them.
 *
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
package session1;

import Utils.TreeNode.TreeNode;
import Utils.TreeNode.TreeWrapper;

class Solution543 {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            setDepth(root);
            return max;
        }
        return 0;
    }

    private int setDepth(TreeNode root) {
        if (root != null) {
            int right = setDepth(root.right);
            int left = setDepth(root.left);
            max = Math.max(right + left, max);
            return Math.max(right, left) + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[1,2,3,4,5]");
        TreeWrapper.prettyPrintTree(treeNode);
        System.out.println(new Solution543().diameterOfBinaryTree(treeNode));
    }
}
