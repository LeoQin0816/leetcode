/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 *
 * https://leetcode.com/problems/student-attendance-record-i/description/
 *
 * algorithms
 * Easy (45.23%)
 * Likes:    143
 * Dislikes: 589
 * Total Accepted:    51.1K
 * Total Submissions: 112.9K
 * Testcase Example:  '"PPALLP"'
 *
 * You are given a string representing an attendance record for a student. The
 * record only contains the following three characters:
 *
 *
 *
 * 'A' : Absent.
 * 'L' : Late.
 * ⁠'P' : Present.
 *
 *
 *
 *
 * A student could be rewarded if his attendance record doesn't contain more
 * than one 'A' (absent) or more than two continuous 'L' (late).
 *
 * You need to return whether the student could be rewarded according to his
 * attendance record.
 *
 * Example 1:
 *
 * Input: "PPALLP"
 * Output: True
 *
 *
 *
 * Example 2:
 *
 * Input: "PPALLL"
 * Output: False
 *
 *
 *
 *
 *
 */
package session1;

class Solution551 {
    public boolean checkRecord(String s) {
        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
    }
}

