/*
Array Partition I

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]
Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
 */

/*
数组拆分 I

给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

示例 1:
输入: [1,4,3,2]
输出: 4
解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).

提示:
n 是正整数,范围在 [1, 10000].
数组中的元素范围在 [-10000, 10000].
 */

import java.util.Arrays;

/**
 * 1. 每一对数值 bi >= ai.
 * 2. 令 Sm = min(a1, b1) + min(a2, b2) + ... + min(an, bn). 最大的Sm = a1 + a2 + ... + an.
 * 3. 令 Sa = a1 + b1 + a2 + b2 + ... + an + bn. Sa 是输入的值.
 * 4. 令 di = |ai - bi|. 则 di = bi - ai. 令 Sd = d1 + d2 + ... + dn.
 * 5. Sa = a1 + a1 + d1 + a2 + a2 + d2 + ... + an + an + dn = 2Sm + Sd => Sm = (Sa - Sd) / 2. 要得到最大 Sm, Sd 必须最小.
 * 6. 所以问题变成每一对数值的差值最小.
 */

class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(new Solution561().arrayPairSum(nums));
    }
}