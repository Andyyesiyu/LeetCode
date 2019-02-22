class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows < 1) {
            return null;
        }
        if (numRows == 1) {
            return s;
        }
        if (s.equals("")) {
            return "";
        }
        
        int base = 2 * numRows - 2;
        int pairs = numRows - 2;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        
        // Add the letters in the first row.
        for (int i = base; i < s.length(); i += base) {
            sb.append(s.charAt(i));
        }
        
        // Add the middle lines.
        for (int i = 0; i < pairs; i++) {
            int[] pair = new int[]{i+1, base-i-1};
            int p = pair[0];
            int q = pair[1];
            while (true) {
                if (p < s.length()) {
                    sb.append(s.charAt(p));
                    p += base;
                }
                if (q < s.length()) {
                    sb.append(s.charAt(q));
                    q += base;
                }
                if (p >= s.length() && q >= s.length()) {
                    break;
                }
            }
        }
        
        // Add the bottom line.
        int bottomIndex = numRows - 1;
        for (int i = bottomIndex; i < s.length(); i += base) {
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}