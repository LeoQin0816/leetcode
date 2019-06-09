/*
 * @lc app=leetcode id=504 lang=java
 *
 * [504] Base 7
 *
 * https://leetcode.com/problems/base-7/description/
 *
 * algorithms
 * Easy (44.89%)
 * Likes:    141
 * Dislikes: 114
 * Total Accepted:    41.2K
 * Total Submissions: 91.7K
 * Testcase Example:  '100'
 *
 * Given an integer, return its base 7 string representation.
 *
 * Example 1:
 *
 * Input: 100
 * Output: "202"
 *
 *
 *
 * Example 2:
 *
 * Input: -7
 * Output: "-10"
 *
 *
 *
 * Note:
 * The input will be in range of [-1e7, 1e7].
 *
 */
package Java;

class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        String res = "";
        boolean flag = false;
        if (num < 0) {
            flag = true;
            num = -num;
        }
        while (num != 0) {
            res = num % 7 + res;
            num /= 7;
        }
        if (flag) return "-" + res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution504().convertToBase7(100));
        System.out.println(new Solution504().convertToBase7(-7));
    }
}

