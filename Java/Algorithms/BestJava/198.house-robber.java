/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 *
 * https://leetcode.com/problems/house-robber/description/
 *
 * algorithms
 * Easy (40.99%)
 * Likes:    2470
 * Dislikes: 74
 * Total Accepted:    319K
 * Total Submissions: 778.2K
 * Testcase Example:  '[1,2,3,1]'
 *
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping
 * you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent
 * houses were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight
 * without alerting the police.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money =
 * 3).
 * Total amount you can rob = 1 + 3 = 4.
 * 
 * Example 2:
 * 
 * 
 * Input: [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house
 * 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 * 
 * 
 */
package BestJava;

class Solution198 {
    public int rob(int[] nums) {
        int prevNo = 0;  // don't rob the current house
        int prevYes = 0;  // rob the current house
        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);  //  not rob current house, current max will depends on previous value: Math.max(prevNo, prevYes)
            prevYes = n + temp;  // rob current one, add current stashed money value
        }
        return Math.max(prevNo, prevYes);
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 1};
//        System.out.println(new Solution198().rob(nums1));

        int[] nums2 = {2, 7, 3, 3, 1};
        System.out.println(new Solution198().rob(nums2));
    }
}