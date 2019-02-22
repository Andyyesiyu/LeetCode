class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
            case '(':
            case '[':
            case '{':
                stack.push(c);
                break;
            case ')':
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            case ']':
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            case '}':
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
                break;
            default:
                return false;
            }
        }
        return (stack.size() == 0);
    }
}