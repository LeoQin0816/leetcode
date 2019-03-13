package Java;
/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
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
class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = helper(nums, low, mid - 1);
        treeNode.right = helper(nums, mid+1, high);
        return treeNode;
    }

    public static void main(String[] args) {
        TreeWrapper.prettyPrintTree(new Solution108().sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
}