# 15. 3Sum

# Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

# Solution (Runtime: 1460 ms, faster than 26.81% of Python submissions):

def threeSum(self, nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    nums.sort()
    results = []
    for i in range(0, len(nums)-2):
        l = i + 1
        r = len(nums) - 1
        while l < r:
            curr_sum = nums[i] + nums[l] + nums[r]
            if curr_sum == 0:
                if [nums[i], nums[l], nums[r]] not in results:
                    results.append([nums[i], nums[l], nums[r]])
                l += 1
                r -= 1

                elif curr_sum >= 0:
                    r -= 1
                else:
                    l += 1

    return results