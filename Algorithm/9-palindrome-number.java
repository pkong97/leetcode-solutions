// 9. Palindrome number
// 75 ms, faster than 97.04% of java submissions
// 29.2 MB, less than 32.24% java sunmissions

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int last = x % 10;
        int reduce = x / 10;
        int reverse = 0;
        while (reduce != 0) {
            reverse += last;
            last = reduce % 10;
            reduce = reduce / 10;
            reverse *= 10;
        }
        reverse += last;
        
        return x == reverse;
    }
}