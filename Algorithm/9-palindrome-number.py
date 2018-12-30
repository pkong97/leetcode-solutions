# 9. Palindrome Number

# Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

# Solution (Runtime: 440 ms, faster than 38.19% of Python3 submissions):

def isPalindrome(self, x):
	"""
	:type x: int
	:rtype: bool
	"""
	if x < 0:
		return False
	return x == int(str(x)[::-1])