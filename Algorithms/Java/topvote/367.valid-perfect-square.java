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
package topvote;

class Solution367 {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution367().isPerfectSquare(16));
        System.out.println(new Solution367().isPerfectSquare(14));
    }
}