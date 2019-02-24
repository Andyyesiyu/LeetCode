class Solution {
    public String countAndSay(int n) {
        if (n < 1) {
            return null;
        }
        if (n == 1) {
            return "1";
        } else {
            return helper(countAndSay(n-1));
        }
    }
    
    private String helper(String previous) {
        int p = 0;
        StringBuilder sb = new StringBuilder();
        while (p < previous.length()) {
            char current = previous.charAt(p);
            int count = 1;
            while (p + 1 < previous.length() && current == previous.charAt(p+1)) {
                p++;
                count++;
            }
            sb.append(String.valueOf(count));
            sb.append(current);
            p++;
        }
        return sb.toString();
    }
}