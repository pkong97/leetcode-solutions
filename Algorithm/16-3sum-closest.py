# 16. 3Sum Closest

# Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

# Solution (Runtime: 104 ms, faster than 50.96% of Python submissions):

def threeSumClosest(self, nums, target):
	"""
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    numss = sorted(nums)
    closest = {}
    for i in range(0, len(nums)-2):
    	curr_num = numss[i]
    	l = i + 1
    	r = len(nums)-1
    	while l < r:
    		curr_sum = curr_num + numss[l] + numss[r]
    		if curr_sum == target:
    			return curr_sum
    		elif curr_sum > target:
    			r -= 1
    			closest[abs(curr_sum-target)] = curr_sum
    		else:
    			l += 1
    			closest[abs(curr_sum-target)] = curr_sum
    return closest[(min(closest.keys()))]