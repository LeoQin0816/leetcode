/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 *
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 *
 * algorithms
 * Easy (36.89%)
 * Likes:    140
 * Dislikes: 553
 * Total Accepted:    55.4K
 * Total Submissions: 150.1K
 * Testcase Example:  '"Hello, my name is John"'
 *
 * Count the number of segments in a string, where a segment is defined to be a
 * contiguous sequence of non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 * Example:
 * 
 * Input: "Hello, my name is John"
 * Output: 5
 * 
 * 
 */

package BestJava;

class Solution434 {
    public int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) res++;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution434().countSegments("Hello, my name is John"));
    }
}