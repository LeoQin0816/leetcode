/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.29%)
 * Likes:    2153
 * Dislikes: 3263
 * Total Accepted:    689.7K
 * Total Submissions: 2.7M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
package session1;

class Solution7 {
    public int reverse(int x) {
        Long num = Math.abs((long) x);
        String res = new StringBuffer(String.valueOf(num)).reverse().toString();
        if (Long.parseLong(res) > Integer.MAX_VALUE) {
            return 0;
        }
        return x > 0 ? Integer.parseInt(res) : Integer.parseInt(res) * -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution7().reverse(123));
        System.out.println(new Solution7().reverse(-123));
        System.out.println(new Solution7().reverse(120));
        System.out.println(new Solution7().reverse(-2147483648));
    }
}

