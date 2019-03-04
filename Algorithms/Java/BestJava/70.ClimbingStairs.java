package BestJava;
/*
70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

/**
 * f(n) = f(n - 1) + f(n - 2)
 * 1 个长度时只有一种方法
 * 2 个长度时有两种方法
 */
class Solution70 {
    public int climbStairs(int n) {
        int[] result = new int[n];
        result[0] = 1;
        if (n >= 2) {
            result[1] = 2;
        }
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution70().climbStairs(3));
    }
}