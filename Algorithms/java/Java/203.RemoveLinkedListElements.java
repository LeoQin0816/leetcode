package Java;
/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

import Utils.ListNode.LinkedListWrapper;
import Utils.ListNode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode node = header;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return header.next;
    }

    public static void main(String[] args) {
        ListNode node = LinkedListWrapper.stringToListNode("[1,2,6,3,4,5,6]");
        LinkedListWrapper.prettyPrintLinkedList(node);
        LinkedListWrapper.prettyPrintLinkedList(new Solution203().removeElements(node, 6));
    }
}