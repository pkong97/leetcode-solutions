// 58. length of last word
// 3 ms, faster than 76.12% of submissions
// 34.8 MB, less tha 0.99% of submissions

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return 0;
        }
        return strs[strs.length-1].length();
    }
}