/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 *
 * https://leetcode.com/problems/degree-of-an-array/description/
 *
 * algorithms
 * Easy (50.28%)
 * Likes:    492
 * Dislikes: 423
 * Total Accepted:    48.7K
 * Total Submissions: 96.8K
 * Testcase Example:  '[1,2,2,3,1]'
 *
 * Given a non-empty array of non-negative integers nums, the degree of this
 * array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray
 * of nums, that has the same degree as nums.
 * 
 * Example 1:
 * 
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation: 
 * The input array has a degree of 2 because both elements 1 and 2 appear
 * twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * 
 * 
 * 
 * Note:
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 * 
 */

package topvote;

import java.util.HashMap;
import java.util.Map;

class Solution697 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                // 第一个参数是该数组的度, 第二个参数是该值的第一个索引, 第三个参数是该值的最后一个索引
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] value : map.values()) {
            if (value[0] > degree) {
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree) {
                res = Math.min(value[2] - value[1] + 1, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1};
        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(new Solution697().findShortestSubArray(nums1));
        System.out.println(new Solution697().findShortestSubArray(nums2));
    }
}