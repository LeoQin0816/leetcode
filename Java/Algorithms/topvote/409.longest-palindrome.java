/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (48.01%)
 * Likes:    510
 * Dislikes: 55
 * Total Accepted:    96.5K
 * Total Submissions: 201.1K
 * Testcase Example:  '"abccccdd"'
 *
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome
 * here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * 
 * Example: 
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * 
 */
package topvote;

import java.util.HashSet;

class Solution409 {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count++;
            } else {
                hs.add(s.charAt(i));
            }
        }
        if (!hs.isEmpty()) return count * 2 + 1;
        return count * 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution409().longestPalindrome("abccccdd"));
    }
}