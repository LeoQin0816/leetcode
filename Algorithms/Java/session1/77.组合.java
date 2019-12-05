import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 *
 * https://leetcode-cn.com/problems/combinations/description/
 *
 * algorithms
 * Medium (70.90%)
 * Likes:    181
 * Dislikes: 0
 * Total Accepted:    26.4K
 * Total Submissions: 37K
 * Testcase Example:  '4\n2'
 *
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * 
 * 示例:
 * 
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * ⁠ [2,4],
 * ⁠ [3,4],
 * ⁠ [2,3],
 * ⁠ [1,2],
 * ⁠ [1,3],
 * ⁠ [1,4],
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, n, k, new ArrayList<>(), 1);
        return res;
    }

    public void backTrack(List<List<Integer>> res, int n, int k, List<Integer> tmp, int index) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = index; i <= n; i++) {
            tmp.add(i);
            backTrack(res, n, k, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
// @lc code=end
