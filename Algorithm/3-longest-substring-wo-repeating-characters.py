# 3. Longest Substring Without Repeating Characters

# Given a string, find the length of the longest substring without repeating characters.

# Solution (Runtime: 496 ms, faster than 16.82% of Python3 submissions):
class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        num_unique = len(set(s))
        if num_unique == 1:
            return 1
        window = num_unique
        ans = 0
        while window > 1:
            for i in range(0, len(s)-window+1):
                if len(set(s[i:(i+window)])) == window:
                    return window
            window -= 1
        
        return ans
                    