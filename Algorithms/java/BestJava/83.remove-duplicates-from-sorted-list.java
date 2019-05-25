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
package BestJava;

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
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
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