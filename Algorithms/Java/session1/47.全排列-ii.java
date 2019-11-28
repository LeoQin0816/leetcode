import java.awt.List;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 *
 * https://leetcode-cn.com/problems/permutations-ii/description/
 *
 * algorithms
 * Medium (55.26%)
 * Likes:    182
 * Dislikes: 0
 * Total Accepted:    29.2K
 * Total Submissions: 52.5K
 * Testcase Example:  '[1,1,2]'
 *
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * 
 * 示例:
 * 
 * 输入: [1,1,2]
 * 输出:
 * [
 * ⁠ [1,1,2],
 * ⁠ [1,2,1],
 * ⁠ [2,1,1]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int[] visited = new int[n];
        backTrack(res, n, nums, new ArrayList<>(), visited);
        return res;
    }

    public void backTrack(List<List<Integer>> res, int n, int[] nums, List<Integer> tmp, int[] visited) {
        if (tmp.size() == n && !res.contains(tmp)) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1)
                continue;
            tmp.add(nums[i]);
            visited[i] = 1;
            backTrack(res, n, nums, tmp, visited);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }
}
// @lc code=end
