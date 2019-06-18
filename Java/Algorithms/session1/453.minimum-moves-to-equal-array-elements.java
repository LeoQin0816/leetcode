/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 *
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
 *
 * algorithms
 * Easy (49.15%)
 * Likes:    363
 * Dislikes: 580
 * Total Accepted:    57.1K
 * Total Submissions: 116.2K
 * Testcase Example:  '[1,2,3]'
 *
 * Given a non-empty integer array of size n, find the minimum number of moves
 * required to make all array elements equal, where a move is incrementing n -
 * 1 elements by 1.
 * 
 * Example:
 * 
 * Input:
 * [1,2,3]
 * 
 * Output:
 * 3
 * 
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * 
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * 
 * 
 */
package session1;

class Solution453 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        for (int i : nums) {
            sum += i;
            min = Math.min(i, min);
        }
        return sum - min * nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution453().minMoves(new int[] { 1, 2, 3 }));
        System.out.println(new Solution453().minMoves(new int[] { 83, 86, 77, 15, 93, 35, 86, 92, 49, 21 }));
    }
}
