/*
Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */

/**
 * 异或运算
 * 1. 0 ^ N = N
 * 2. N ^ N = 0
 * 如果 N 是出现了一次的数字，其余为出现两次的数字
 *
 * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
 * = 0 ^ 0 ^ ..........^ 0 ^ N
 * = N
 *
 * 关键在于其余数字出现偶数次
 */
class Solution136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(new Solution136().singleNumber(nums));
    }
}