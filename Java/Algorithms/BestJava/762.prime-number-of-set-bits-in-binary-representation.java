/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 *
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/
 *
 * algorithms
 * Easy (59.08%)
 * Likes:    155
 * Dislikes: 235
 * Total Accepted:    28.3K
 * Total Submissions: 47.9K
 * Testcase Example:  '842\n888'
 *
 * 
 * Given two integers L and R, find the count of numbers in the range [L, R]
 * (inclusive) having a prime number of set bits in their binary
 * representation.
 * 
 * (Recall that the number of set bits an integer has is the number of 1s
 * present when written in binary.  For example, 21 written in binary is 10101
 * which has 3 set bits.  Also, 1 is not a prime.)
 * 
 * 
 * Example 1:
 * Input: L = 6, R = 10
 * Output: 4
 * Explanation:
 * 6 -> 110 (2 set bits, 2 is prime)
 * 7 -> 111 (3 set bits, 3 is prime)
 * 9 -> 1001 (2 set bits , 2 is prime)
 * 10->1010 (2 set bits , 2 is prime)
 * 
 * 
 * Example 2:
 * Input: L = 10, R = 15
 * Output: 5
 * Explanation:
 * 10 -> 1010 (2 set bits, 2 is prime)
 * 11 -> 1011 (3 set bits, 3 is prime)
 * 12 -> 1100 (2 set bits, 2 is prime)
 * 13 -> 1101 (3 set bits, 3 is prime)
 * 14 -> 1110 (3 set bits, 3 is prime)
 * 15 -> 1111 (4 set bits, 4 is not prime)
 * 
 * 
 * Note:
 * L, R will be integers L  in the range [1, 10^6].
 * R - L will be at most 10000.
 * 
 */


package BestJava;

class Solution762 {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        /*
        除去 1
        2，3 均为素数
        不在 6 的倍数两侧，能被 2 或者 3 整除，不可能为素数
        n 若能被 i 整除，因式分解，必定一个数小于 i，一个数大于 i，只需要判断到i为止是否能整除 i
        判断 6 的倍数两侧是否能整除 n
         */
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Solution762().countPrimeSetBits(842, 888));
        System.out.println(new Solution762().countPrimeSetBits(10, 15));
    }
}
