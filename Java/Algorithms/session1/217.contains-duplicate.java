/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (51.87%)
 * Likes:    385
 * Dislikes: 506
 * Total Accepted:    333.6K
 * Total Submissions: 643.2K
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * 
 * 
 * Input: [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 */
package session1;

import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution217().containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(new Solution217().containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(new Solution217().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}