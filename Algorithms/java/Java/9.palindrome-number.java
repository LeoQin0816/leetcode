/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (43.27%)
 * Likes:    1403
 * Dislikes: 1292
 * Total Accepted:    578.5K
 * Total Submissions: 1.3M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */
package Java;
class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] charArray = String.valueOf(x).toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] == charArray[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution9().isPalindrome(121));
        System.out.println(new Solution9().isPalindrome(-121));
        System.out.println(new Solution9().isPalindrome(10));
    }
}

