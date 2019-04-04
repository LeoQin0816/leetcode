#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2019-04-03 17:09
# @Author  : LeoQin
# @Site    : 
# @File    : 1.TwoSum.py
# @Software: PyCharm

class Solution1:
    def twoSum(self, nums, target):
        if len(nums) <= 1:
            return False
        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
            else:
                buff_dict[target - nums[i]] = i


if __name__ == '__main__':
    print(Solution1().twoSum([2, 7, 11, 15], 9))
