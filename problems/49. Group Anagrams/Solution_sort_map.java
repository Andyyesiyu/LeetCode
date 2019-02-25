class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return null;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // Sort the str.
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String sortStr = new String(ca);
            if (map.containsKey(sortStr)) {
                map.get(sortStr).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(sortStr, list);
            }
        }
        List<List<String>> result = new LinkedList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}