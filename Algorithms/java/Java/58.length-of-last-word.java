/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (32.26%)
 * Likes:    366
 * Dislikes: 1534
 * Total Accepted:    266.8K
 * Total Submissions: 827.2K
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * Example:
 * 
 * 
 * Input: "Hello World"
 * Output: 5
 * 
 * 
 * 
 * 
 */
package Java;

class Solution58 {
    public int lengthOfLastWord(String s) {
        while (s.length() > 0 && s.charAt(s.length() - 1) == ' ') {
            s = s.substring(0, s.length() - 1);
        }
        String[] res = s.split(" ");
        return res[res.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution58().lengthOfLastWord("Hello World"));
    }
}