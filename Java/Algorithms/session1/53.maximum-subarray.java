/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (43.55%)
 * Likes:    4233
 * Dislikes: 145
 * Total Accepted:    526.7K
 * Total Submissions: 1.2M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */

package session1;

class Solution53 {
    public int maxSubArray(int[] nums) {
        int maxHere = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxHere = Math.max(nums[i], maxHere + nums[i]);
            max = Math.max(max, maxHere);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}