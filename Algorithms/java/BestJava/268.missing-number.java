/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 *
 * https://leetcode.com/problems/missing-number/description/
 *
 * algorithms
 * Easy (48.35%)
 * Likes:    880
 * Dislikes: 1316
 * Total Accepted:    274.6K
 * Total Submissions: 568K
 * Testcase Example:  '[3,0,1]'
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,0,1]
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * 
 * 
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement
 * it using only constant extra space complexity?
 */
package BestJava;

class Solution268 {
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new Solution268().missingNumber(nums1));
        System.out.println(new Solution268().missingNumber(nums2));
    }
}