class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            try {
                stack.push(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token.charAt(0)) {
                case '+':
                    stack.push(a + b);
                    break;
                case '-':
                    stack.push(a - b);
                    break;
                case '*':
                    stack.push(a * b);
                    break;
                case '/':
                    stack.push(a / b);
                    break;
                }
            }
        }
        return stack.pop();
    }
}