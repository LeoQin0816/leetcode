/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 *
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * algorithms
 * Easy (55.03%)
 * Likes:    359
 * Dislikes: 307
 * Total Accepted:    136.3K
 * Total Submissions: 247.7K
 * Testcase Example:  '[1,0,1,1,0,1]'
 *
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * Example 1:
 * 
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive
 * 1s.
 * ⁠   The maximum number of consecutive 1s is 3.
 * 
 * 
 * 
 * Note:
 * 
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * 
 * 
 */
package session1;

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag++;
            } else {
                max = Math.max(max, flag);
                flag = 0;
            }
        }
        return Math.max(max, flag);
    }

    public static void main(String[] args) {
        System.out.println(new Solution485().findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    }
}
