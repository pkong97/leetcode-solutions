// 680. Valid Palindrome II
// 24 ms, faster than 36.94% of Java submissions
// 39.4 MB, less than 0.90% of Java submissions

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome(s)) {
            return true;
        }
        StringBuilder strs = new StringBuilder(s);
        StringBuilder strs2 = new StringBuilder(s);
        strs.deleteCharAt(left);
        strs2.deleteCharAt(right);
        return (isPalindrome(strs.toString()) || isPalindrome(strs2.toString()));
    }
    
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}