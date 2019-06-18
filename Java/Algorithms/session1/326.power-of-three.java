/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 *
 * https://leetcode.com/problems/power-of-three/description/
 *
 * algorithms
 * Easy (41.65%)
 * Likes:    266
 * Dislikes: 1005
 * Total Accepted:    183K
 * Total Submissions: 439.3K
 * Testcase Example:  '27'
 *
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Example 1:
 * 
 * 
 * Input: 27
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 0
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: 9
 * Output: true
 * 
 * Example 4:
 * 
 * 
 * Input: 45
 * Output: false
 * 
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
package session1;

class Solution326 {
    public boolean isPowerOfThree(int n) {
        return n >= 0 && Math.pow(3, 19) % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution326().isPowerOfThree(27));
        System.out.println(new Solution326().isPowerOfThree(0));
        System.out.println(new Solution326().isPowerOfThree(9));
        System.out.println(new Solution326().isPowerOfThree(45));
    }
}