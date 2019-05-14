package Java;
/*
Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example, given a 3-ary tree:







We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6]
]


Note:

The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
 */

import Utils.Node.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> nodeQueue = new LinkedList<>();
        if (root == null) return res;
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            int length = nodeQueue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                Node node = nodeQueue.poll();
                temp.add(node.val);
                for (Node n : node.children) nodeQueue.offer(n);
            }
            res.add(temp);
        }
        return res;
    }
}