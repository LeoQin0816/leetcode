/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 *
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 *
 * algorithms
 * Easy (30.37%)
 * Likes:    1582
 * Dislikes: 72
 * Total Accepted:    76.1K
 * Total Submissions: 250.5K
 * Testcase Example:  '[2,6,4,8,10,9,15]'
 *
 * Given an integer array, you need to find one continuous subarray that if you
 * only sort this subarray in ascending order, then the whole array will be
 * sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 *
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make
 * the whole array sorted in ascending order.
 *
 *
 *
 * Note:
 *
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means .
 *
 *
 */
package session1;

class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int max = nums[0], min = nums[nums.length - 1];
        int begin = 0, end = -1;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            if (nums[i] < max) end = i;
            min = Math.min(nums[nums.length - i - 1], min);
            if (nums[nums.length - i - 1] > min) begin = nums.length - i - 1;
        }
        return end - begin + 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution581().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}

