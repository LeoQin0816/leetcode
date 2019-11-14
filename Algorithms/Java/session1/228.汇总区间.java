import java.util.List;

/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 *
 * https://leetcode-cn.com/problems/summary-ranges/description/
 *
 * algorithms
 * Medium (48.90%)
 * Likes:    29
 * Dislikes: 0
 * Total Accepted:    4.8K
 * Total Submissions: 9.8K
 * Testcase Example:  '[0,1,2,4,5,7]'
 *
 * 给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。
 * 
 * 示例 1:
 * 
 * 输入: [0,1,2,4,5,7]
 * 输出: ["0->2","4->5","7"]
 * 解释: 0,1,2 可组成一个连续的区间; 4,5 可组成一个连续的区间。
 * 
 * 示例 2:
 * 
 * 输入: [0,2,3,4,6,8,9]
 * 输出: ["0","2->4","6","8->9"]
 * 解释: 2,3,4 可组成一个连续的区间; 8,9 可组成一个连续的区间。
 * 
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<>();
        int length = nums.length;
        int end = 0;
        while (end < length) {
            int start = end;
            while (end < length - 1 && nums[end] + 1 == nums[end + 1]) {
                end++;
            }
            if (start == end) {
                summary.add(nums[end] + "");
            } else {
                summary.add(nums[start] + "->" + nums[end]);
            }
            end++;
        }
        return summary;
    }
}
// @lc code=end
