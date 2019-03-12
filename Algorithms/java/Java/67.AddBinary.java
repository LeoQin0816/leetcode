package Java;
/*
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"

Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

class Solution67 {
    public String addBinary(String a, String b) {
        int la = a.length() - 1;
        int lb = b.length() - 1;
        StringBuffer res = new StringBuffer();
        boolean flag = false;
        while (la >= 0 || lb >= 0) {
            int tempa = 0;
            int tempb = 0;
            if (la >= 0) {
                tempa = a.charAt(la--) - '0';
            }
            if (lb >= 0) {
                tempb = b.charAt(lb--) - '0';
            }
            int c = tempa + tempb;
            if (flag) {
                c++;
                flag = false;
            }
            if (c >= 2) {
                flag = true;
            }
            res.append(c == 0 ? 0 : Math.abs(c - 2));
        }
        if (flag) {
            res.append(1);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution67().addBinary("0", "0"));
        System.out.println(new Solution67().addBinary("11", "1"));
        System.out.println(new Solution67().addBinary("1010", "1011"));
    }
}