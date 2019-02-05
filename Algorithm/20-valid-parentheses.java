// 20. Valid Parentheses
// 5ms, faster than 84.90% of submissions
class Solution {
    public boolean isValid(String s) {
        Stack<Character> oBracks = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('||
                s.charAt(i) == '['||
                s.charAt(i) == '{') {
                oBracks.push(s.charAt(i));
            } else if (!oBracks.empty()) {
                switch(s.charAt(i)) {
                    case ')':
                        if (oBracks.peek() == '(') oBracks.pop(); else return false;
                        break;
                    case ']':
                        if (oBracks.peek() == '[') oBracks.pop(); else return false;
                        break;
                    case '}':
                        if (oBracks.peek() == '{') oBracks.pop(); else return false;
                        break;
                    default:
                        throw new IllegalArgumentException("invalid character");
                }
            } else return false;
        }
        return oBracks.empty();
    }
}