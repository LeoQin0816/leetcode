package LinkedList;

/*
234. Palindrome Linked List

Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false

Example 2:

Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?
 */

/*
234. 回文链表

请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false

示例 2:

输入: 1->2->2->1
输出: true

进阶：
你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
//        链表总数为奇数时，无视最中间数字
//        可减少比较一位数字
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head1 = Wrapper.stringToListNode("[1,2]");
        Wrapper.prettyPrintLinkedList(head1);
        System.out.println(new Solution234().isPalindrome(head1));

        ListNode head2 = Wrapper.stringToListNode("[1,2,2,1]");
        Wrapper.prettyPrintLinkedList(head2);
        System.out.println(new Solution234().isPalindrome(head2));

        ListNode head3 = Wrapper.stringToListNode("[1,2,3,2,1]");
        Wrapper.prettyPrintLinkedList(head3);
        System.out.println(new Solution234().isPalindrome(head3));
    }
}