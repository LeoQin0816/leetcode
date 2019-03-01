/*
Given an n-ary tree, return the preorder traversal of its nodes' values.

For example, given a 3-ary tree:







Return its preorder traversal as: [1,3,5,6,2,4].



Note:

Recursive solution is trivial, could you do it iteratively?
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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