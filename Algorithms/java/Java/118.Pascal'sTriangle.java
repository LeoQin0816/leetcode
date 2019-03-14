package Java;
/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            temp.add(0,1);
            for (int j = 1; j < temp.size() - 1; j++) {
                temp.set(j, temp.get(j) + temp.get(j + 1));
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution118().generate(5));
    }
}