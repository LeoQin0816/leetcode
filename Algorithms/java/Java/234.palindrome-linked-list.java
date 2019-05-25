/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 *
 * https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * algorithms
 * Easy (36.02%)
 * Likes:    1612
 * Dislikes: 240
 * Total Accepted:    257.4K
 * Total Submissions: 714.5K
 * Testcase Example:  '[1,2]'
 *
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->2
 * Output: false
 * 
 * Example 2:
 * 
 * 
 * Input: 1->2->2->1
 * Output: true
 * 
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
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

import java.util.LinkedList;
import java.util.Stack;


class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != head.val) return false;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode1 = LinkedListWrapper.stringToListNode("[1,2]");
        LinkedListWrapper.prettyPrintLinkedList(listNode1);
        System.out.println(new Solution234().isPalindrome(listNode1));
        ListNode listNode2 = LinkedListWrapper.stringToListNode("[1,2,2,1]");
        LinkedListWrapper.prettyPrintLinkedList(listNode2);
        System.out.println(new Solution234().isPalindrome(listNode2));
    }
}