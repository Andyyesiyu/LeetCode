class Solution {
    /*
        Time: O(N^2) worst case
    */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        return helper(s, 0);
    }
    
    private int helper(String s, int startIndex) {
        if (startIndex >= s.length()) {
            return 0;
        }
        int maxOfRest = helper(s, startIndex+1);
        int lengthMaxStartHere = maxLengthStartHere(s, startIndex);
        return Math.max(lengthMaxStartHere, maxOfRest);
    }
    
    private int maxLengthStartHere (String s, int startIndex) {
        /*
            O(N)
        */
        Set<Character> set = new HashSet<>();
        int counter = 0;
        for (int i = startIndex; i < s.length(); i++) {
            /*
                HashSet is O(1)
            */
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                counter++;
            } else {
                return counter;
            }
        }
        return counter;
    }
}