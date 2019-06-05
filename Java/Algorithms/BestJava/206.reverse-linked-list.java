/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 *
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (54.60%)
 * Likes:    2289
 * Dislikes: 61
 * Total Accepted:    584.2K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * Reverse a singly linked list.
 * 
 * Example:
 * 
 * 
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * 
 * 
 * Follow up:
 * 
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
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

class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListWrapper.stringToListNode("[1,2,3,4,5]");
        LinkedListWrapper.prettyPrintLinkedList(head);
        ListNode res = new Solution206().reverseList(head);
        LinkedListWrapper.prettyPrintLinkedList(res);
    }
}