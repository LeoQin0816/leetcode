--
-- @lc app=leetcode id=176 lang=mysql
--
-- [176] Second Highest Salary
--
-- https://leetcode.com/problems/second-highest-salary/description/
--
-- database
-- Easy (27.12%)
-- Likes:    488
-- Dislikes: 251
-- Total Accepted:    130K
-- Total Submissions: 479.3K
-- Testcase Example:  '{"headers": {"Employee": ["Id", "Salary"]}, "rows": {"Employee": [[1, 100], [2, 200], [3, 300]]}}'
--
-- Write a SQL query to get the second highest salary from the Employee
-- table.
-- 
-- 
-- +----+--------+
-- | Id | Salary |
-- +----+--------+
-- | 1  | 100    |
-- | 2  | 200    |
-- | 3  | 300    |
-- +----+--------+
-- 
-- 
-- For example, given the above Employee table, the query should return 200 as
-- the second highest salary. If there is no second highest salary, then the
-- query should return null.
-- 
-- 
-- +---------------------+
-- | SecondHighestSalary |
-- +---------------------+
-- | 200                 |
-- +---------------------+
-- 
-- 
--

select max(Salary) as SecondHighestSalary
from Employee
where Salary<(select max(Salary)
from Employee)
