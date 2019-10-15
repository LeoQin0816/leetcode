/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 *
 * https://leetcode-cn.com/problems/spiral-matrix-ii/description/
 *
 * algorithms
 * Medium (75.14%)
 * Likes:    120
 * Dislikes: 0
 * Total Accepted:    17.4K
 * Total Submissions: 23.2K
 * Testcase Example:  '3'
 *
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * 
 * 示例:
 * 
 * 输入: 3
 * 输出:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 8, 9, 4 ],
 * ⁠[ 7, 6, 5 ]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1;
        int t = 0, b = n - 1;
        int num = 1;
        while (true) {
            for (int i = l; i <= r; i++) {
                res[t][i] = num++;
            }
            if (++t > b) {
                break;
            }
            for (int i = t; i <= b; i++) {
                res[i][r] = num++;
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res[b][i] = num++;
            }
            if (--b < t) {
                break;
            }
            for (int i = b; i >= t; i--) {
                res[i][l] = num++;
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }
}
// @lc code=end
