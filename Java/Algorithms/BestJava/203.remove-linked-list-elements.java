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
package BestJava;

import Utils.ListNode.ListNode;
import Utils.ListNode.LinkedListWrapper;


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