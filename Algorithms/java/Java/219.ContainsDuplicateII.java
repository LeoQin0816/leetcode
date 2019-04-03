package Java;
/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

import java.util.HashSet;
import java.util.Set;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (nums[i] == nums[i + j]) return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution219().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(new Solution219().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(new Solution219().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        System.out.println(new Solution219().containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}, 3));
    }
}