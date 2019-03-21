class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        int p, q;
        p = 0;
        q = s.length() - 1;

        while (true) {
            // Move p and q to valid letters.
            while (!Character.isLetter(s.charAt(p)) && !Character.isDigit(s.charAt(p))) {
                p++;
                if (p >= q) {
                    return true;
                }
            }
            while (!Character.isLetter(s.charAt(q)) && !Character.isDigit(s.charAt(q))) {
                q--;
                if (p >= q) {
                    return true;
                }
            }
            if (Character.toLowerCase(s.charAt(p++)) != Character.toLowerCase(s.charAt(q--))) {
                return false;
            }
            if (p >= q) {
                return true;
            }
        }
    }
}