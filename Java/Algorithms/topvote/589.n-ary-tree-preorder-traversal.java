/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 *
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/
 *
 * algorithms
 * Easy (67.36%)
 * Likes:    216
 * Dislikes: 33
 * Total Accepted:    41.5K
 * Total Submissions: 61.5K
 * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
 *
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * 
 * For example, given a 3-ary tree:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Return its preorder traversal as: [1,3,5,6,2,4].
 * 
 * 
 * 
 * Note:
 * 
 * Recursive solution is trivial, could you do it iteratively?
 * 
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


package topvote;

import Utils.Node.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class Solution589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                stack.add(root.children.get(i));
        }

        return list;
    }

    public static void main(String[] args) {
        Node subSubChild1 = new Node(5, new LinkedList<>());
        Node subSubChild2 = new Node(6, new LinkedList<>());
        List<Node> subSubChild = new LinkedList<>();
        subSubChild.add(subSubChild1);
        subSubChild.add(subSubChild2);
        Node subChild1 = new Node(3, subSubChild);
        Node subChild2 = new Node(2, new LinkedList<>());
        Node subChild3 = new Node(4, new LinkedList<>());
        List<Node> subChild = new LinkedList<>();
        subChild.add(subChild1);
        subChild.add(subChild2);
        subChild.add(subChild3);
        Node root = new Node(1, subChild);

        System.out.println(new Solution589().preorder(root));
    }
}