/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 *
 * https://leetcode.com/problems/image-smoother/description/
 *
 * algorithms
 * Easy (48.71%)
 * Likes:    179
 * Dislikes: 785
 * Total Accepted:    35K
 * Total Submissions: 71.8K
 * Testcase Example:  '[[1,1,1],[1,0,1],[1,1,1]]'
 *
 * Given a 2D integer matrix M representing the gray scale of an image, you
 * need to design a smoother to make the gray scale of each cell becomes the
 * average gray scale (rounding down) of all the 8 surrounding cells and
 * itself.  If a cell has less than 8 surrounding cells, then use as many as
 * you can.
 * 
 * Example 1:
 * 
 * Input:
 * [[1,1,1],
 * ⁠[1,0,1],
 * ⁠[1,1,1]]
 * Output:
 * [[0, 0, 0],
 * ⁠[0, 0, 0],
 * ⁠[0, 0, 0]]
 * Explanation:
 * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 * 
 * 
 * 
 * Note:
 * 
 * The value in the given matrix is in the range of [0, 255].
 * The length and width of the given matrix are in the range of [1, 150].
 * 
 * 
 */

package topvote;

class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        int nx = M.length;
        int ny = M[0].length;
        int[][] res = new int[nx][ny];
        for (int i = 0; i < nx; i++) {
            for (int j = 0; j < ny; j++) {
                res[i][j] = smooth(M, i, j);
            }
        }
        return res;
    }

    private int smooth(int[][] M, int x, int y) {
        int nx = M.length;
        int ny = M[0].length;
        int sum = 0;
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i < 0 || x + i >= nx || y + j < 0 || y + j >= ny) {
                    continue;
                }
                count++;
                sum += M[x + i][y + j];
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        int[][] M = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

//        System.out.println(new Solution661().imageSmoother(M));
    }
}