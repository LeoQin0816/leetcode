/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (31.07%)
 * Likes:    580
 * Dislikes: 1701
 * Total Accepted:    353.7K
 * Total Submissions: 1.1M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "race a car"
 * Output: false
 * 
 * 
 */
package session1;

class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high && (s.charAt(low) > 'z' || s.charAt(low) < 'a') && (s.charAt(low) > '9' || s.charAt(low) < '0')) low++;
            while (low < high && (s.charAt(high) > 'z' || s.charAt(high) < 'a') && (s.charAt(high) > '9' || s.charAt(high) < '0')) high--;
            if (s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution125().isPalindrome("0P"));
        System.out.println(new Solution125().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution125().isPalindrome("race a car"));
    }
}