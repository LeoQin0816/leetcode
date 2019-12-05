/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 *
 * https://leetcode-cn.com/problems/permutation-sequence/description/
 *
 * algorithms
 * Medium (47.29%)
 * Likes:    143
 * Dislikes: 0
 * Total Accepted:    18.1K
 * Total Submissions: 38.2K
 * Testcase Example:  '3\n3'
 *
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * 
 * 
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 
 * 
 * 给定 n 和 k，返回第 k 个排列。
 * 
 * 说明：
 * 
 * 
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 
 * 
 * 示例 1:
 * 
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 
 * 
 * 示例 2:
 * 
 * 输入: n = 4, k = 9
 * 输出: "2314"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        List<String> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtrack(res, nums, new StringBuilder(), visited, k);
        return res.get(k - 1);

    }

    private void backtrack(List<String> res, int[] nums, StringBuilder tmp, int[] visited, int k) {
        if (tmp.length() == nums.length) {
            res.add(new String(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (res.size() > k) {
                return;
            }
            if (visited[i] == 1)
                continue;
            visited[i] = 1;
            tmp.append(nums[i]);
            backtrack(res, nums, tmp, visited, k);
            visited[i] = 0;
            tmp.deleteCharAt(tmp.length() - 1);
        }
    }
}
// @lc code=end
