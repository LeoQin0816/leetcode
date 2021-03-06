/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
 *
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/
 *
 * algorithms
 * Easy (65.50%)
 * Likes:    338
 * Dislikes: 19
 * Total Accepted:    46K
 * Total Submissions: 70.3K
 * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
 *
 * Given a n-ary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 * 
 * For example, given a 3-ary tree:
 * 
 * 
 * 
 * 
 * 
 * 
 * We should return its max depth, which is 3.
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

class Solution559 {
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int max = 0;
        for (Node child : root.children) {
            int value = maxDepth(child);
            if (value > max) max = value;
        }
        return max + 1;
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

        System.out.println(new Solution559().maxDepth(root));
    }
}