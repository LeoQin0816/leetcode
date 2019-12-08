import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 *
 * https://leetcode-cn.com/problems/restore-ip-addresses/description/
 *
 * algorithms
 * Medium (44.90%)
 * Likes:    162
 * Dislikes: 0
 * Total Accepted:    19.3K
 * Total Submissions: 43K
 * Testcase Example:  '"25525511135"'
 *
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * 
 * 示例:
 * 
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 * 
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backTrack(res, 0, s, 0, new StringBuilder());
        return res;
    }

    public void backTrack(List<String> res, int pointNum, String s, int index, StringBuilder temp) {
        if (pointNum > 4) {
            return;
        }
        if (index == s.length() && pointNum == 4) { // pointNumOfSb==4，则是一个合法的IP
            res.add(temp.toString().substring(1)); // substring(1)是因为每次append(".xxx")，第零个位置是"."
            return;
        }
        for (int i = index; i < s.length() && i - index < 3; i++) {
            String x = s.substring(index, i + 1);
            if (x.charAt(0) == '0' && x.length() > 1) // 如果是0xx这种则返回
                return;
            if (Integer.parseInt(x) <= 255) {
                temp.append("." + x);
                backTrack(res, pointNum + 1, s, i + 1, temp);
                temp.delete(temp.lastIndexOf("."), temp.length());
            }
        }
    }
}
// @lc code=end
