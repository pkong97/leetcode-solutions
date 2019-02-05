# 46. Permutations
# Given a collection of distinct integers, return all possible permutations.

# Runtime: 44 ms, faster than 100% of submissions
# Memory usage: 6.6 MB, less than 91.98% of submissions

class Solution:                
    def permute(self, nums):
        
        def swap(nums, a, b):
            temp = nums[a]
            nums[a] = nums[b]
            nums[b] = temp
        
        result = [nums]
        for i in range(0, len(nums)):
            l = len(result)
            for j in range(i+1, len(nums)):
                for k in range(0, l):
                    dupe = result[k].copy()
                    swap(dupe, i, j)
                    result.append(dupe)
        
        
        return result
    
    
                