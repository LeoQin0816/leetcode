import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 *
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (37.22%)
 * Likes:    223
 * Dislikes: 0
 * Total Accepted:    26.4K
 * Total Submissions: 70.7K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 
 * 示例 1:
 * 
 * 输入:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++)
                res.add(matrix[up][i]);
            if (++up > down)
                break;
            for (int i = up; i <= down; i++)
                res.add(matrix[i][right]);
            if (--right < left)
                break;
            for (int i = right; i >= left; i--)
                res.add(matrix[down][i]);
            if (--down < up)
                break;
            for (int i = down; i >= up; i--)
                res.add(matrix[i][left]);
            if (++left > right)
                break;
        }
        return res;
    }
}
// @lc code=end
