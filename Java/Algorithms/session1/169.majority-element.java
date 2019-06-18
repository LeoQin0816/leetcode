/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (52.58%)
 * Likes:    1629
 * Dislikes: 142
 * Total Accepted:    381.1K
 * Total Submissions: 724.8K
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * 
 * 
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 */
package session1;

class Solution169 {
    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution169().majorityElement(new int[]{3, 2, 3}));
        System.out.println(new Solution169().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}