// 46. Permutations
// 2 ms, faster than 99.89% of Java submissions
// 27.5 MB, less than 15.56% of Java submissions

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> init = new ArrayList<>();
        for (int n = 0; n < nums.length; n++) {
            init.add(nums[n]);
        }
        result.add(init);
        for (int i = 0; i < nums.length; i++) {
            int l = result.size();
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = 0; k < l; k++) {
                    List<Integer> dupe = new ArrayList<>(result.get(k));
                    swap(dupe, i, j);
                    result.add(dupe);
                }
            }
        }
        return result;
        
    }
    public void swap(List<Integer> nums, int a, int b) {
        int temp = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b, temp);
    }
}