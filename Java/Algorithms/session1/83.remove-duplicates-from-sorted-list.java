/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 *
 * algorithms
 * Easy (42.55%)
 * Likes:    747
 * Dislikes: 78
 * Total Accepted:    326.7K
 * Total Submissions: 767.7K
 * Testcase Example:  '[1,1,2]'
 *
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->1->2
 * Output: 1->2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 1->1->2->3->3
 * Output: 1->2->3
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
package session1;

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
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = LinkedListWrapper.stringToListNode("[1,1,2]");
        ListNode listNode2 = LinkedListWrapper.stringToListNode("[1,1,2,3,3]");
        LinkedListWrapper.prettyPrintLinkedList(listNode1);
        LinkedListWrapper.prettyPrintLinkedList(new Solution83().deleteDuplicates(listNode1));
        LinkedListWrapper.prettyPrintLinkedList(listNode2);
        LinkedListWrapper.prettyPrintLinkedList(new Solution83().deleteDuplicates(listNode2));
    }
}