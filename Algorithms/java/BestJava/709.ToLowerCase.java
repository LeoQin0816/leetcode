package BestJava;
/*
709. To Lower Case

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:

Input: "Hello"
Output: "hello"

Example 2:

Input: "here"
Output: "here"

Example 3:

Input: "LOVELY"
Output: "lovely"
 */

class Solution709 {
    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char) (a[i] - 'A' + 'a');
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(new Solution709().toLowerCase("Hello"));
        System.out.println(new Solution709().toLowerCase("here"));
        System.out.println(new Solution709().toLowerCase("LOVELY"));
    }
}