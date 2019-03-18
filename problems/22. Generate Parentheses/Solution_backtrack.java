class Solution {
    public List<String> generateParenthesis(int n) {
        if (n < 0) {
            return null;
        }
        List<String> result = new LinkedList<>();
        helper(result, "", n, 0, 0);
        return result;
    }

    private void helper(List<String> result, String temp, int n, int open, int close) {
        if (temp.length() == n * 2) {
            result.add(temp);
            return;
        }
        if (open < n) {
            helper(result, temp + "(", n, open + 1, close);
        }
        if (open > close) {
            helper(result, temp + ")", n, open, close + 1);
        }
    }
}