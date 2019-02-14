// 5. Longest Palindromic Substring
// 2618 ms, faster than 1.09% of Java submissions
// 37.1 MB, less than 7.98% of Java submissions
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String curr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String ss = s.substring(i,j);
                if (isPalindrome(ss) && ss.length() > curr.length()) {
                    curr = ss;
                }
            }
        }
        return curr;
    }
    
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
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