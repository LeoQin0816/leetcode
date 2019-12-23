/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 *
 * https://leetcode-cn.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (42.34%)
 * Likes:    77
 * Dislikes: 0
 * Total Accepted:    19.6K
 * Total Submissions: 45.9K
 * Testcase Example:  '16'
 *
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * 
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * 
 * 示例 1：
 * 
 * 输入：16
 * 输出：True
 * 
 * 示例 2：
 * 
 * 输入：14
 * 输出：False
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {

        int l = 1, r = 46340;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                l = mid + 1;
            else if (mid * mid > num)
                r = mid - 1;
        }
        return false;
    }
}
// @lc code=end
