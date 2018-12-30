# 11. Container With Most Water

# Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

# Solution 1, Brute Force (Time limit exceeded):

def maxArea(self, height):
	"""
    :type height: List[int]
	:rtype: int
	"""
	#brute force
    max = 0
	for index, num in enumerate(height):
		for num2 in range(0, len(height)):
			area = min(num, height[num2])*(num2-index)
                if area > max:
                    max = area
    return max

# Solution 2 (Runtime: 92 ms, faster than 37.17% of Python 3 online submissions):

def maxArea(self, height):
	"""
    :type height: List[int]
	:rtype: int
    """
	max_area = 0
	left = 0
    right = len(height)-1
    while left < right:
		area = min(height[left], height[right])*(right-left)
		if (height[left] < height[right]):
            left += 1
        else:
            right -= 1
        if area > max_area:
            max_area = area
    return max_area