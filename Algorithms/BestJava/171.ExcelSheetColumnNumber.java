/*
171. Excel Sheet Column Number

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...
Example 1:

Input: "A"
Output: 1

Example 2:

Input: "AB"
Output: 28

Example 3:

Input: "ZY"
Output: 701
 */

class Solution171 {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = s.length() - 1, j = 1; i >= 0; i--, j *= 26) {
            result += (s.charAt(i) - 'A' + 1) * j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution171().titleToNumber("A"));
        System.out.println(new Solution171().titleToNumber("AB"));
        System.out.println(new Solution171().titleToNumber("ZY"));
    }
}