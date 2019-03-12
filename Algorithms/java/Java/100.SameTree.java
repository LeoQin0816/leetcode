package Java;

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