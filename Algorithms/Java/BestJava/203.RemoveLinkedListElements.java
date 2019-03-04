package BestJava;
/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

import Utils.ListNode.ListNode;
import Utils.ListNode.LinkedListWrapper;

/**
 * Definition for singly-linked list.
 * public class Utils.ListNode {
 * int val;
 * Utils.ListNode next;
 * Utils.ListNode(int x) { val = x; }
 * }
 */
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListWrapper.stringToListNode("[1,2,6,3,4,5,6]");
        LinkedListWrapper.prettyPrintLinkedList(head);
        ListNode res = new Solution203().removeElements(head, 6);
        LinkedListWrapper.prettyPrintLinkedList(res);
    }
}