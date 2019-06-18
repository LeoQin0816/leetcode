/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (62.19%)
 * Likes:    392
 * Dislikes: 490
 * Total Accepted:    88.1K
 * Total Submissions: 141.7K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below.
 * 
 * 
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */
package topvote;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution500 {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
//        每一行键盘设置其index
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> res = new LinkedList<>();
        for (String w : words) {
            if (w.equals("")) continue;
            int index = map.get(w.toUpperCase().charAt(0));
            for (char c : w.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) res.add(w);
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] res = new Solution500().findWords(words);
        for (String r : res) {
            System.out.println(r);
        }
    }
}