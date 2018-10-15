/*
367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true

Example 2:

Input: 14
Output: false
 */

class Solution367 {
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution367().isPerfectSquare(16));
        System.out.println(new Solution367().isPerfectSquare(14));
    }
}