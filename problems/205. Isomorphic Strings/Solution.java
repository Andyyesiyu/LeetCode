class Solution {
    public boolean isIsomorphic(String s, String t) {
        // First if two strings do not have equal length, reture false.
        if (s.length() != t.length()) {
            return false;
        }
        
        // Key is characters in s, Value is characters in t
        // TODO: Note that no two characters can map to same character
        Map<Character, Character> map = new HashMap<>();
        
        /* Iterate through each index i:
        if map exists s[i] => t[i], do nothing;
        if map exists s[i]'s mapping but to another char, return false;
        if do not exist map of s[i]:
            if t[i] already mapped, return false, because no two characters can map to same character;
            else    create new map;
        after iteration, return true;
        */
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (map.containsKey(sC)) {
                if (map.get(sC) != tC) {
                    return false;
                } else {
                    continue;
                }
            } else {
                if (map.containsValue(tC)) {
                    return false;
                } else {
                    map.put(sC, tC);
                }
            }
        }
        return true;
    }
}