/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 *
 * https://leetcode.com/problems/string-compression/description/
 *
 * algorithms
 * Easy (37.67%)
 * Likes:    354
 * Dislikes: 1103
 * Total Accepted:    51.5K
 * Total Submissions: 136.8K
 * Testcase Example:  '["a","a","b","b","c","c","c"]'
 *
 * Given an array of characters, compress it in-place.
 * 
 * The length after compression must always be smaller than or equal to the
 * original array.
 * 
 * Every element of the array should be a character (not int) of length 1.
 * 
 * After you are done modifying the input array in-place, return the new length
 * of the array.
 * 
 * 
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * 
 * 
 * Example 1:
 * 
 * 
 * Input:
 * ["a","a","b","b","c","c","c"]
 * 
 * Output:
 * Return 6, and the first 6 characters of the input array should be:
 * ["a","2","b","2","c","3"]
 * 
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by
 * "c3".
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:
 * ["a"]
 * 
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * 
 * Explanation:
 * Nothing is replaced.
 * 
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 
 * Output:
 * Return 4, and the first 4 characters of the input array should be:
 * ["a","b","1","2"].
 * 
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed.
 * "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 * 
 * 
 */
package BestJava;

class Solution443 {
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while (index < chars.length) {
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar) {
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1)
                for (char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

    public static void main(String[] args) {
        System.out.println(new Solution443().compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(new Solution443().compress(new char[]{'a'}));
        System.out.println(new Solution443().compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}