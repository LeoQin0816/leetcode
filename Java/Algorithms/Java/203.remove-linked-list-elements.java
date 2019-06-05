/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 *
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * algorithms
 * Easy (35.76%)
 * Likes:    811
 * Dislikes: 46
 * Total Accepted:    223.9K
 * Total Submissions: 626.2K
 * Testcase Example:  '[1,2,6,3,4,5,6]\n6'
 *
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example:
 * 
 * 
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
package Java;

import Utils.ListNode.LinkedListWrapper;
import Utils.ListNode.ListNode;

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