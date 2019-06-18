/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 *
 * https://leetcode.com/problems/add-digits/description/
 *
 * algorithms
 * Easy (54.08%)
 * Likes:    446
 * Dislikes: 775
 * Total Accepted:    237.7K
 * Total Submissions: 439.6K
 * Testcase Example:  '38'
 *
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * Example:
 * 
 * 
 * Input: 38
 * Output: 2 
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 * 
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
package session1;

class Solution258 {
    public int addDigits(int num) {
        if (num <= 9) return num;
        if (num > 9) num %= 9;
        if (num == 0) return 9;
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution258().addDigits(38));
    }
}