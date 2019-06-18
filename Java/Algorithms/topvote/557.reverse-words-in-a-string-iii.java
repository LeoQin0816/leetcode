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
package topvote;


class Solution557 {
//    我的解决方案
    public String MyreverseWords(String s) {
        String[] sArr = s.split(" ");
        String res = new String();
        for (String str : sArr) {
            char[] chars = str.toCharArray();
            int i = 0;
            int j = chars.length - 1;
            while (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            res += new String(chars) + " ";
        }
        return res.trim();
    }

    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (String st : str) result.append(st + " ");
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new Solution557().MyreverseWords("Let's take LeetCode contest"));
        System.out.println(new Solution557().reverseWords("Let's take LeetCode contest"));
    }
}