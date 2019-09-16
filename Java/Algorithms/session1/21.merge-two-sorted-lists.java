/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (48.36%)
 * Likes:    2609
 * Dislikes: 376
 * Total Accepted:    673.1K
 * Total Submissions: 1.4M
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
package session1;

import Utils.ListNode.*;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode dym = res;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                dym.next = l2;
                l2 = l2.next;
            } else {
                dym.next = l1;
                l1 = l1.next;
            }
            dym = dym.next;
        }
        dym.next = l1 == null ? l2 : l1;
        return res.next;
    }

}
