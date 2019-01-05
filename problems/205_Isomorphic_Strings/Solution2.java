class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        // First consider several edge cases.
        if (s == null && t == null) return true;
        if (s == null && t != null || s != null && t == null)   return false;
        if (s.length() != t.length())   return false;
        
        /*
        We want to have two 256 (length of ASCII) long arrays a and b to somehow store the mapping.
        A unique value is used to mark each mapping. If a[i] == b[j], then i is mapped to j.
        If they are not equal, it means:
            1. They are in different mapping. return false.
            2. One of them is mapped, and another isn't. Since no two chars can be mapped to a same char, this can also return false.
        */
        int[] a, b;
        a = new int[256];
        b = new int[256];
        Arrays.fill(a, -1);
        Arrays.fill(b, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (a[sC] != b[tC]) {
                return false;
            } else {
                a[sC] = i;
                b[tC] = i;
            }
        }
        return true;
    }
}