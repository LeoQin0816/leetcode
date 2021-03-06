/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 *
 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
 *
 * algorithms
 * Easy (63.34%)
 * Likes:    571
 * Dislikes: 51
 * Total Accepted:    36.3K
 * Total Submissions: 57.3K
 * Testcase Example:  '"loveleetcode"\n"e"'
 *
 * Given a string S and a character C, return an array of integers representing
 * the shortest distance from the character C in the string.
 * 
 * Example 1:
 * 
 * 
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 * 
 * 
 */
package topvote;

class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
//        pos若初始化为0，在第一个到达C的位置之前的所有距离即为其index
//        在第二轮循环时，无法重新赋值
//        pos 至少<= -n
        int pos = -n;
        for (int i = 0; i < n; ++i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = i - pos;
        }
        for (int i = n - 1; i >= 0; --i) {
            if (S.charAt(i) == C) pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        int[] res = new Solution821().shortestToChar(S, C);
        for (int r : res) {
            System.out.println(r);
        }
    }
}