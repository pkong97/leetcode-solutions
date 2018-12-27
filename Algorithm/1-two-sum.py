# 1 Two Sum

# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.

# Solution (Runtime: 40ms, faster than 80.69% of Python3 online submissions):

def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        wanted_sums = {}
        for index, number in enumerate(nums):
            if target - number in wanted_sums:
                return [wanted_sums[target - number], index]
            else:
                wanted_sums[number] = index