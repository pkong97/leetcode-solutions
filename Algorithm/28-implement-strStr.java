// 28. Implement strStr()
// 4ms, faster than 88.05% of submissions
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int strLen = needle.length();
        int j = strLen ;
        for (int i = 0; i < haystack.length(); i++) {
            if (j <= haystack.length() && haystack.substring(i,j).equals(needle)) {
                return i;
            }
            j++;
        }
        return -1;
    }
}