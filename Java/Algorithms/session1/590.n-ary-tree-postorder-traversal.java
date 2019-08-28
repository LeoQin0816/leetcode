
/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
 *
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/
 *
 * algorithms
 * Easy (68.45%)
 * Likes:    345
 * Dislikes: 44
 * Total Accepted:    48.5K
 * Total Submissions: 70.8K
 * Testcase Example:  '{"$id":"1","children":[{"$id":"2","children":[{"$id":"5","children":[],"val":5},{"$id":"6","children":[],"val":6}],"val":3},{"$id":"3","children":[],"val":2},{"$id":"4","children":[],"val":4}],"val":1}'
 *
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *
 *
 *
 *
 *
 *
 *
 * Return its postorder traversal as: [5,6,3,2,4,1].
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
package session1;

import Utils.Node.Node;

import java.util.ArrayList;
import java.util.List;

class Solution590 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return res;
        for (Node node : root.children) {
            postorder(node);
        }
        res.add(root.val);
        return res;
    }
}

