class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = compareStrings(result, strs[i]);
            if (result.equals("")) {
                return "";
            }
        }
        return result;
    }

    private String compareStrings(String a, String b) {
        StringBuilder s = new StringBuilder();
        int p, q;
        p = 0;
        q = 0;
        while (p < a.length() && q < b.length()) {
            if (a.charAt(p) == b.charAt(q)) {
                s.append(a.charAt(p));
                p++;
                q++;
            } else {
                break;
            }
        }
        return s.toString();
    }
}