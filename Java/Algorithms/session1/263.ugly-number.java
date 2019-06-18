/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 *
 * https://leetcode.com/problems/ugly-number/description/
 *
 * algorithms
 * Easy (40.58%)
 * Likes:    227
 * Dislikes: 417
 * Total Accepted:    156.4K
 * Total Submissions: 385.5K
 * Testcase Example:  '6'
 *
 * Write a program to check whether a given number is an ugly number.
 * 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * 
 * Example 1:
 * 
 * 
 * Input: 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * 
 * Example 2:
 * 
 * 
 * Input: 8
 * Output: true
 * Explanation: 8 = 2 × 2 × 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 14
 * Output: false 
 * Explanation: 14 is not ugly since it includes another prime factor 7.
 * 
 * 
 * Note:
 * 
 * 
 * 1 is typically treated as an ugly number.
 * Input is within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * 
 */
package session1;

class Solution263 {
    public boolean isUgly(int num) {
        for (int i = 2; i < 6 && num > 0; i++) {
            while (num % i == 0) num /= i;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution263().isUgly(6));
        System.out.println(new Solution263().isUgly(8));
        System.out.println(new Solution263().isUgly(14));
    }
}