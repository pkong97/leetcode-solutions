// Two Sum
// Brute Force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSumOptimal(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		map.put(nums[i], i);
    	}
    	for (int i = 0; i < nums.length; i++) {
    		int complement = target - nums[i];
    		if (map.containsKey(complement) && map.get(complement) != i) {
    			return new int[] {i, map.get(complement)};
    		}
    	}
    	throw new IllegalArgumentException("No two sum solution");
    }
}