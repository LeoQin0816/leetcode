package String;

/*
Reverse String

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */

/*
反转字符串

请编写一个函数，其功能是将输入的字符串反转过来。

示例：
输入：s = "hello"
返回："olleh"
 */

class Solution344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new Solution344().reverseString("Hello"));
    }
}