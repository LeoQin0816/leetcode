/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 *
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (37.30%)
 * Likes:    733
 * Dislikes: 206
 * Total Accepted:    202.3K
 * Total Submissions: 542.2K
 * Testcase Example:  '"egg"\n"add"'
 *
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * 
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 * 
 * Note:
 * You may assume both s and t have the same length.
 * 
 */
package session1;

import java.util.HashMap;
import java.util.Map;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if (map.containsKey(sc)) {
                if (!map.get(sc).equals(tc)) return false;
            } else {
                if (map.containsValue(tc)) return false;
                map.put(sc, tc);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution205().isIsomorphic("ab", "aa"));
        System.out.println(new Solution205().isIsomorphic("egg", "add"));
        System.out.println(new Solution205().isIsomorphic("foo", "bar"));
        System.out.println(new Solution205().isIsomorphic("paper", "title"));
    }
}