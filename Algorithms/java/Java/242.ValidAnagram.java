package Java;
/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

import java.util.HashMap;
import java.util.Map;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] temp = new int[26];
        for (Character c : s.toCharArray()) temp[c - 'a']++;
        for (Character c : t.toCharArray()) temp[c - 'a']--;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution242().isAnagram("anagram", "nagaram"));
        System.out.println(new Solution242().isAnagram("rat", "car"));
    }
}