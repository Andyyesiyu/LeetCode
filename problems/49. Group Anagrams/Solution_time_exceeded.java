class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return null;
        }
        List<List<String>> result = new LinkedList<>();
        for (String str : strs) {
            boolean flag = false;
            for (int i = 0; i < result.size(); i++) {
                List<String> l = result.get(i);
                if (compareStrings(str, l.get(0))) {
                    l.add(str);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                List<String> newList = new LinkedList<>();
                newList.add(str);
                result.add(newList);
            }
        }
        return result;
    }

    private boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < s1.length(); i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}