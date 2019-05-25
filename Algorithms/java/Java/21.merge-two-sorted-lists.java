/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (47.20%)
 * Likes:    2208
 * Dislikes: 312
 * Total Accepted:    580K
 * Total Submissions: 1.2M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
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

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0), temp = res;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        if (l1 == null) {
            temp.next = l2;
        } else {
            temp.next = l1;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListWrapper.stringToListNode("[1,2,4]");
        ListNode l2 = LinkedListWrapper.stringToListNode("[1,3,4]");
        LinkedListWrapper.prettyPrintLinkedList(l1);
        LinkedListWrapper.prettyPrintLinkedList(l2);
        LinkedListWrapper.prettyPrintLinkedList(new Solution21().mergeTwoLists(l1, l2));
    }
}