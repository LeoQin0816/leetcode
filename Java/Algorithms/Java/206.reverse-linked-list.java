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
package Java;

import Utils.ListNode.LinkedListWrapper;
import Utils.ListNode.ListNode;

class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode res = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = res;
            res = head;
            head = temp;
        }
        return res;
    }

    ListNode res = null;

    public ListNode reverseList2(ListNode head) {
        if (head != null) {
            ListNode temp = head.next;
            head.next = res;
            res = head;
            return reverseList2(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode1 = LinkedListWrapper.stringToListNode("[1,2,3,4,5]");
        LinkedListWrapper.prettyPrintLinkedList(listNode1);
        LinkedListWrapper.prettyPrintLinkedList(new Solution206().reverseList(listNode1));
        ListNode listNode2 = LinkedListWrapper.stringToListNode("[1,2,3,4,5]");
        LinkedListWrapper.prettyPrintLinkedList(listNode2);
        LinkedListWrapper.prettyPrintLinkedList(new Solution206().reverseList2(listNode2));
    }
}