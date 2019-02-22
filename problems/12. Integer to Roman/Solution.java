class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        // NavigableMap nmap = map.descendingMap();

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (num >= key) {
                int times = num / key;
                for (int i = 0; i < times; i++) {
                    result.append(value);
                }
                num -= times * key;
                if (num <= 0) {
                    break;
                }
            }
        }

        return result.toString();
    }
}