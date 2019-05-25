--
-- @lc app=leetcode id=626 lang=mysql
--
-- [626] Exchange Seats
--
-- https://leetcode.com/problems/exchange-seats/description/
--
-- database
-- Medium (54.30%)
-- Likes:    166
-- Dislikes: 165
-- Total Accepted:    24.1K
-- Total Submissions: 44.3K
-- Testcase Example:  '{"headers": {"seat": ["id","student"]}, "rows": {"seat": [[1,"Abbot"],[2,"Doris"],[3,"Emerson"],[4,"Green"],[5,"Jeames"]]}}'
--
-- Mary is a teacher in a middle school and she has a table seat storing
-- students' names and their corresponding seat ids.
-- The column id is continuous increment.
-- 
-- 
-- Mary wants to change seats for the adjacent students.
-- 
-- 
-- Can you write a SQL query to output the result for Mary?
-- 
-- 
-- 
-- 
-- +---------+---------+
-- |    id   | student |
-- +---------+---------+
-- |    1    | Abbot   |
-- |    2    | Doris   |
-- |    3    | Emerson |
-- |    4    | Green   |
-- |    5    | Jeames  |
-- +---------+---------+
-- 
-- For the sample input, the output is:
-- 
-- 
-- 
-- 
-- +---------+---------+
-- |    id   | student |
-- +---------+---------+
-- |    1    | Doris   |
-- |    2    | Abbot   |
-- |    3    | Green   |
-- |    4    | Emerson |
-- |    5    | Jeames  |
-- +---------+---------+
-- 
-- 
-- Note:
-- If the number of students is odd, there is no need to change the last one's
-- seat.
-- 
--

select
if(id < (select count(*)
from seat),
if(id mod z2=0, id-z1, id+z1),
if(id mod z2=0, id-z1, id)) as id, student from seat order by id asc

