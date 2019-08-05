/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * algorithms
 * Easy (64.03%)
 * Likes:    615
 * Dislikes: 66
 * Total Accepted:    124.7K
 * Total Submissions: 194.7K
 * Testcase Example:  '"Let\'s take LeetCode contest"'
 *
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * 
 * 
 * Note:
 * In the string, each word is separated by single space and there will not be
 * any extra space in the string.
 * 
 */
package session1;

class Solution557 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            stringBuffer.append(new StringBuffer(strings[i]).reverse().toString()).append(" ");
        }
        return stringBuffer.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new Solution557().reverseWords("Let's take LeetCode contest"));
    }
}

