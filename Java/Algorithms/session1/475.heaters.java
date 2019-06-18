/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 *
 * https://leetcode.com/problems/heaters/description/
 *
 * algorithms
 * Easy (31.76%)
 * Likes:    480
 * Dislikes: 506
 * Total Accepted:    47.6K
 * Total Submissions: 150K
 * Testcase Example:  '[1,2,3]\n[2]'
 *
 * Winter is coming! Your first job during the contest is to design a standard
 * heater with fixed warm radius to warm all the houses.
 * 
 * Now, you are given positions of houses and heaters on a horizontal line,
 * find out minimum radius of heaters so that all houses could be covered by
 * those heaters.
 * 
 * So, your input will be the positions of houses and heaters seperately, and
 * your expected output will be the minimum radius standard of heaters.
 * 
 * Note:
 * 
 * 
 * Numbers of houses and heaters you are given are non-negative and will not
 * exceed 25000.
 * Positions of houses and heaters you are given are non-negative and will not
 * exceed 10^9.
 * As long as a house is in the heaters' warm radius range, it can be
 * warmed.
 * All the heaters follow your radius standard and the warm radius will the
 * same.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: [1,2,3],[2]
 * Output: 1
 * Explanation: The only heater was placed in the position 2, and if we use the
 * radius 1 standard, then all the houses can be warmed.
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,2,3,4],[1,4]
 * Output: 1
 * Explanation: The two heater was placed in the position 1 and 4. We need to
 * use radius 1 standard, then all the houses can be warmed.
 * 
 * 
 * 
 * 
 */
package session1;

import java.util.Arrays;

class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;
        for (int house : houses) {
            // 房子在加热器的什么位置
            int index = Arrays.binarySearch(heaters, house);
            // 如果为负数，index为需要插入的位置大的位置的index
            if (index < 0) {
                index = -(index + 1);
            }
            // 第一个房子前没有加热器
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            // 最后一个房子后没有加热器
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
            res = Math.max(res, Math.min(dist1, dist2));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution475().findRadius(new int[] { 1, 2, 3, 5, 15 }, new int[] { 2, 30 }));
    }
}
