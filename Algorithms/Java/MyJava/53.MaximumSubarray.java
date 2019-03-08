package MyJava;
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

class Solution53 {
    public int maxSubArray(int[] nums) {
        int maxHere = 0;
        int max = 0;
        for (int num : nums) {
            maxHere = Math.max(num, maxHere + num);
            max = Math.max(max, maxHere);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}