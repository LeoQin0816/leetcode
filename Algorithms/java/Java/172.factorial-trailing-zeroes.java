/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 *
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/
 *
 * algorithms
 * Easy (37.37%)
 * Likes:    471
 * Dislikes: 669
 * Total Accepted:    156K
 * Total Submissions: 417.4K
 * Testcase Example:  '3'
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Example 1:
 * 
 * 
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * 
 * Example 2:
 * 
 * 
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 */
package Java;

class Solution172 {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution172().trailingZeroes(3));
        System.out.println(new Solution172().trailingZeroes(5));
    }
}