/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 *
 * https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 *
 * algorithms
 * Easy (57.89%)
 * Likes:    293
 * Dislikes: 69
 * Total Accepted:    41K
 * Total Submissions: 70.8K
 * Testcase Example:  '5'
 *
 * Given a positive integer, check whether it has alternating bits: namely, if
 * two adjacent bits will always have different values.
 * 
 * Example 1:
 * 
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * 
 * 
 * 
 * Example 4:
 * 
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 * 
 * 
 */
package BestJava;

class Solution693 {
    public boolean hasAlternatingBits(int n) {
        /*
        n < 0

        n =         1 0 1 0 1 0 1 0
        n >> 1      0 1 0 1 0 1 0 1
        n ^ n>>1    1 1 1 1 1 1 1 1
        n           1 1 1 1 1 1 1 1
        n + 1     1 0 0 0 0 0 0 0 0
        n & (n+1)   0 0 0 0 0 0 0 0
        */

        /*
        n > 0

        n =         0 1 0 1 0 1 0 1
        n >> 1      0 0 1 0 1 0 1 0
        n ^ n>>1    0 1 1 1 1 1 1 1
        n           0 1 1 1 1 1 1 1
        n + 1       1 0 0 0 0 0 0 0
        n & (n+1)   0 0 0 0 0 0 0 0
         */

        n = n ^ (n >> 1);
        return (n & n + 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution693().hasAlternatingBits(5));
        System.out.println(new Solution693().hasAlternatingBits(7));
        System.out.println(new Solution693().hasAlternatingBits(11));
        System.out.println(new Solution693().hasAlternatingBits(10));
    }
}