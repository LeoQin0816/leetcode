/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 *
 * https://leetcode.com/problems/third-maximum-number/description/
 *
 * algorithms
 * Easy (28.98%)
 * Likes:    369
 * Dislikes: 675
 * Total Accepted:    91.9K
 * Total Submissions: 317.1K
 * Testcase Example:  '[3,2,1]'
 *
 * Given a non-empty array of integers, return the third maximum number in this
 * array. If it does not exist, return the maximum number. The time complexity
 * must be in O(n).
 * 
 * Example 1:
 * 
 * Input: [3, 2, 1]
 * 
 * Output: 1
 * 
 * Explanation: The third maximum is 1.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [1, 2]
 * 
 * Output: 2
 * 
 * Explanation: The third maximum does not exist, so the maximum (2) is
 * returned instead.
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: [2, 2, 3, 1]
 * 
 * Output: 1
 * 
 * Explanation: Note that the third maximum here means the third maximum
 * distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 * 
 * 
 */
package Java;

class Solution414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        Integer[] max = new Integer[]{null, null, null};
        for (Integer n : nums) {
            if (n.equals(max[0]) || n.equals(max[1]) || n.equals(max[2])) continue;
            if (max[0] == null || n > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = n;
            } else if (max[1] == null || n > max[1]) {
                max[2] = max[1];
                max[1] = n;
            } else if (max[2] == null || n > max[2]) {
                max[2] = n;
            }
        }
        return max[2] == null ? max[0] : max[2];
    }

    public static void main(String[] args) {
        System.out.println(new Solution414().thirdMax(new int[]{1, 1, 2}));
    }
}