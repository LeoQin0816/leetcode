package MyJava;
/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */

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