/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 *
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/
 *
 * algorithms
 * Easy (59.37%)
 * Likes:    231
 * Dislikes: 30
 * Total Accepted:    32K
 * Total Submissions: 53.9K
 * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
 *
 * Given an n-ary tree, return the level order traversal of its nodes' values.
 * (ie, from left to right, level by level).
 * 
 * For example, given a 3-ary tree:
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * We should return its level order traversal:
 * 
 * 
 * [
 * ⁠    [1],
 * ⁠    [3,2,4],
 * ⁠    [5,6]
 * ]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 * 
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

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();

        if (root == null) return ret;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> curLevel = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node curr = queue.poll();
                curLevel.add(curr.val);
                for (Node c : curr.children)
                    queue.offer(c);
            }
            ret.add(curLevel);
        }

        return ret;
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

        System.out.println(new Solution429().levelOrder(root));
    }
}