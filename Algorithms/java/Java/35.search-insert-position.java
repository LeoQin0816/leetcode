/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (40.82%)
 * Likes:    1286
 * Dislikes: 177
 * Total Accepted:    399.1K
 * Total Submissions: 977.8K
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: [1,3,5,6], 0
 * Output: 0
 * 
 * 
 */

package Java;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution35().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new Solution35().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new Solution35().searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(new Solution35().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}