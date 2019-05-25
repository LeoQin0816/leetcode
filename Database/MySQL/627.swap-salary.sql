--
-- @lc app=leetcode id=627 lang=mysql
--
-- [627] Swap Salary
--
-- https://leetcode.com/problems/swap-salary/description/
--
-- database
-- Easy (68.59%)
-- Likes:    298
-- Dislikes: 224
-- Total Accepted:    64.9K
-- Total Submissions: 94.7K
-- Testcase Example:  '{"headers":{"salary":["id","name","sex","salary"]},"rows":{"salary":[[1,"A","m",2500],[2,"B","f",1500],[3,"C","m",5500],[4,"D","f",500]]}}'
--
-- Given a table salary, such as the one below, that has m=male and f=female
-- values. Swap all f and m values (i.e., change all f values to m and vice
-- versa) with a single update statement and no intermediate temp table.
-- 
-- Note that you must write a single update statement, DO NOT write any select
-- statement for this problem.
-- 
-- 
-- 
-- Example:
-- 
-- 
-- | id | name | sex | salary |
-- |----|------|-----|--------|
-- | 1  | A    | m   | 2500   |
-- | 2  | B    | f   | 1500   |
-- | 3  | C    | m   | 5500   |
-- | 4  | D    | f   | 500    |
-- 
-- After running your update statement, the above salary table should have the
-- following rows:
-- 
-- 
-- | id | name | sex | salary |
-- |----|------|-----|--------|
-- | 1  | A    | f   | 2500   |
-- | 2  | B    | m   | 1500   |
-- | 3  | C    | f   | 5500   |
-- | 4  | D    | m   | 500    |
-- 
-- 
--

update salary set sex = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex));

update salary set sex= CHAR(ASCII('f') + ASCII('m') - ASCII(sex));

