import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 *
 * https://leetcode-cn.com/problems/subsets-ii/description/
 *
 * algorithms
 * Medium (57.23%)
 * Likes:    135
 * Dislikes: 0
 * Total Accepted:    14.9K
 * Total Submissions: 26K
 * Testcase Example:  '[1,2,2]'
 *
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 
 * 说明：解集不能包含重复的子集。
 * 
 * 示例:
 * 
 * 输入: [1,2,2]
 * 输出:
 * [
 * ⁠ [2],
 * ⁠ [1],
 * ⁠ [1,2,2],
 * ⁠ [2,2],
 * ⁠ [1,2],
 * ⁠ []
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrace(0, nums, res, new ArrayList<>());
        return res;
    }

    public void backtrace(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> temp) {
        res.add(new ArrayList<>(temp));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            temp.add(nums[j]);
            backtrace(j + 1, nums, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end
