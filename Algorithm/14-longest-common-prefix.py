# 14. Longest Common Prefix

# Write a function to find the longest common prefix string amongst an array of strings.
# If there is no common prefix, return an empty string "".

# Solution (Runtime: 36 ms, faster than 99.67% of Python3 submissions):

def longestCommonPrefix(self, strs):
    """
    :type strs: List[str]
    :rtype: str
    """
    if len(strs) == 0:
        return ""
        
	prefix = strs[0]
    for i in range(1, len(strs)):
		while prefix != strs[i][0:len(prefix)]:
            prefix = prefix[0:len(prefix)-1]
            if len(prefix) == 0:
                return ""
    return prefix