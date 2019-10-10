/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 *
 * https://leetcode.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (70.31%)
 * Likes:    1294
 * Dislikes: 114
 * Total Accepted:    237K
 * Total Submissions: 337K
 * Testcase Example:  '1\n4'
 *
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * Note:
 * 0 ≤ x, y < 2^31.
 * 
 * 
 * Example:
 * 
 * Input: x = 1, y = 4
 * 
 * Output: 2
 * 
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 * 
 * The above arrows point to positions where the corresponding bits are
 * different.
 * 
 * 
 */
package topvote;

class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        System.out.println(new Solution461().hammingDistance(1, 4));
    }
}