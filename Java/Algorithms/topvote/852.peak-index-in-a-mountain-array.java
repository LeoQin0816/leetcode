/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 *
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 *
 * algorithms
 * Easy (69.58%)
 * Likes:    274
 * Dislikes: 644
 * Total Accepted:    73.9K
 * Total Submissions: 106.2K
 * Testcase Example:  '[0,1,0]'
 *
 * Let's call an array A a mountain if the following properties hold:
 * 
 * 
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] <
 * A[i] > A[i+1] > ... > A[A.length - 1]
 * 
 * 
 * Given an array that is definitely a mountain, return any i such that A[0] <
 * A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 * 
 * Example 1:
 * 
 * 
 * Input: [0,1,0]
 * Output: 1
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [0,2,1,0]
 * Output: 1
 * 
 * 
 * Note:
 * 
 * 
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 * 
 * 
 */
package topvote;

class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i + 1 < A.length; ++i) if (A[i] > A[i + 1]) return i;
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {0, 2, 1, 0};
        System.out.println(new Solution852().peakIndexInMountainArray(A));
    }
}