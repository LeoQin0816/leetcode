/*
 * @lc app=leetcode id=437 lang=java
 *
 * [437] Path Sum III
 *
 * https://leetcode.com/problems/path-sum-iii/description/
 *
 * algorithms
 * Easy (42.76%)
 * Likes:    1818
 * Dislikes: 86
 * Total Accepted:    104.7K
 * Total Submissions: 244.9K
 * Testcase Example:  '[10,5,-3,3,2,null,11,3,-2,null,1]\n8'
 *
 * You are given a binary tree in which each node contains an integer value.
 * 
 * Find the number of paths that sum to a given value.
 * 
 * The path does not need to start or end at the root or a leaf, but it must go
 * downwards
 * (traveling only from parent nodes to child nodes).
 * 
 * The tree has no more than 1,000 nodes and the values are in the range
 * -1,000,000 to 1,000,000.
 * 
 * Example:
 * 
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * 
 * ⁠     10
 * ⁠    /  \
 * ⁠   5   -3
 * ⁠  / \    \
 * ⁠ 3   2   11
 * ⁠/ \   \
 * 3  -2   1
 * 
 * Return 3. The paths that sum to 8 are:
 * 
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
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


class Solution437 {
    int num = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return num;
        pathSumFrom(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return num;
    }

    private void pathSumFrom(TreeNode root, int sum) {
        if (root == null) return;
        if (sum == root.val) num++;
        pathSumFrom(root.left, sum - root.val);
        pathSumFrom(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeWrapper.stringToTreeNode("[10,5,-3,3,2,null,11,3,-2,null,1]");
        TreeWrapper.prettyPrintTree(treeNode);
        System.out.println(new Solution437().pathSum(treeNode, 8));
    }
}