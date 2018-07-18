package Others;

/*
Shortest Distance to a Character

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:
Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

Note:
S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 */

/*
字符的最短距离

给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。

示例 1:
输入: S = "loveleetcode", C = 'e'
输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

说明:
字符串 S 的长度范围为 [1, 10000]。
C 是一个单字符，且保证是字符串 S 里的字符。
S 和 C 中的所有字母均为小写字母。
 */

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