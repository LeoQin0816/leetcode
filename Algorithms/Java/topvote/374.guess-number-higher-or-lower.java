/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 *
 * https://leetcode.com/problems/guess-number-higher-or-lower/description/
 *
 * algorithms
 * Easy (39.39%)
 * Likes:    223
 * Dislikes: 1137
 * Total Accepted:    106.5K
 * Total Submissions: 270.4K
 * Testcase Example:  '10\n6'
 *
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I'll tell you whether the number is higher or
 * lower.
 * 
 * You call a pre-defined API guess(int num) which returns 3 possible results
 * (-1, 1, or 0):
 * 
 * 
 * -1 : My number is lower
 * ⁠1 : My number is higher
 * ⁠0 : Congrats! You got it!
 * 
 * 
 * Example :
 * 
 * 
 * 
 * Input: n = 10, pick = 6
 * Output: 6
 * 
 * 
 * 
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

      package topvote;

class Solution374 {
    public int guessNumber(int n) {
        int i = 1, j = n;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    private int guess(int i) {
        if (i == 6) {
            return 0;
        } else if (i < 6) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution374().guessNumber(10));
    }
}