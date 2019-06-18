/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 *
 * https://leetcode.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (39.76%)
 * Likes:    444
 * Dislikes: 104
 * Total Accepted:    109.7K
 * Total Submissions: 275.8K
 * Testcase Example:  '16'
 *
 * Given a positive integer num, write a function which returns True if num is
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: 16
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 14
 * Output: false
 * 
 * 
 * 
 */
package session1;

class Solution367 {
    public boolean isPerfectSquare(int num) {
        if (num <= 1) return true;
        long left = 0, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) return true;
            if (mid * mid < num) left = mid + 1;
            if (mid * mid > num) right = mid - 1;
        }
        return false;
    }
}