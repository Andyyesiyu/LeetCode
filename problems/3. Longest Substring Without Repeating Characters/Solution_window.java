class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding window. [i, j)
        int i = 0;
        int j = 0;
        int result = 0;
        HashSet<Character> charsInWindow = new HashSet<>();
        
        while (i < s.length() && j < s.length()) {
            if (!charsInWindow.contains(s.charAt(j))) {
                charsInWindow.add(s.charAt(j));
                j++;
                result = Math.max(result, charsInWindow.size());
            } else {
                // Move i until the replication is not in the window.
                while (s.charAt(i) != s.charAt(j)) {
                    charsInWindow.remove(s.charAt(i++));
                }
                i++;
                // Do not forget this!
                j++;
            }
        }
        
        return result;
    }
}