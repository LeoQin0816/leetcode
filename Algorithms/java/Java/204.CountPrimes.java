package Java;
/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

class Solution204 {
    public int countPrimes(int n) {
        boolean[] check = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (check[i] == false) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    check[i * j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution204().countPrimes(10));
    }
}