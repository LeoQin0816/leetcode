/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 *
 * https://leetcode.com/problems/employee-importance/description/
 *
 * algorithms
 * Easy (54.03%)
 * Likes:    389
 * Dislikes: 387
 * Total Accepted:    45.5K
 * Total Submissions: 84.1K
 * Testcase Example:  '[[1,2,[2]], [2,3,[]]]\n2'
 *
 * You are given a data structure of employee information, which includes the
 * employee's unique id, his importance value and his direct subordinates' id.
 * 
 * For example, employee 1 is the leader of employee 2, and employee 2 is the
 * leader of employee 3. They have importance value 15, 10 and 5, respectively.
 * Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has
 * [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3
 * is also a subordinate of employee 1, the relationship is not direct.
 * 
 * Now given the employee information of a company, and an employee id, you
 * need to return the total importance value of this employee and all his
 * subordinates.
 * 
 * Example 1:
 * 
 * 
 * Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
 * Output: 11
 * Explanation:
 * Employee 1 has importance value 5, and he has two direct subordinates:
 * employee 2 and employee 3. They both have importance value 3. So the total
 * importance value of employee 1 is 5 + 3 + 3 = 11.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * One employee has at most one direct leader and may have several
 * subordinates.
 * The maximum number of employees won't exceed 2000.
 * 
 * 
 * 
 * 
 */
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
package topvote;

import java.util.*;

class Solution690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportanceBFS(List<Employee> employees, int id) {
        int total = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        while (!queue.isEmpty()) {
            Employee current = queue.poll();
            total += current.importance;
            for (int subordinate : current.subordinates) {
                queue.offer(map.get(subordinate));
            }
        }
        return total;
    }

    public int getImportanceDFS(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return getImportanceHelper(map, id);
    }

    private int getImportanceHelper(Map<Integer, Employee> map, int rootId) {
        Employee root = map.get(rootId);
        int total = root.importance;
        for (int subordinate : root.subordinates) {
            total += getImportanceHelper(map, subordinate);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Solution690 solution690 = new Solution690();
        Employee employee = solution690.new Employee();
        employee.id = 1;
        employee.importance = 5;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        employee.subordinates = list;
        employees.add(employee);
        employee = solution690.new Employee();
        employee.id = 2;
        employee.importance = 3;
        list = new ArrayList<>();
        employee.subordinates = list;
        employees.add(employee);
        employee = solution690.new Employee();
        employee.id = 3;
        employee.importance = 3;
        employee.subordinates = list;
        employees.add(employee);

        System.out.println(new Solution690().getImportanceBFS(employees, 1));
        System.out.println(new Solution690().getImportanceDFS(employees, 1));
    }
}