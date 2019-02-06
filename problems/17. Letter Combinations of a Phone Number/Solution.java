class Solution {
    public List<String> letterCombinations(String digits) {
        // Time: O(The number of possibilities)
        if (digits == null) {
            return null;
        }
        List<String> result = new LinkedList<>();
        if (digits.equals("")) {
            return result;
        }
        letterCombinationsHelper(digits, result, new StringBuilder());
        return result;
    }
    
    private void letterCombinationsHelper(String digits, List<String> result, StringBuilder temp) {
        if (temp.length() == digits.length()) {
            result.add(temp.toString());
            return;
        }
        for (char c : lookUp(digits.charAt(temp.length()))) {
            temp.append(c);
            letterCombinationsHelper(digits, result, temp);
            temp.setLength(temp.length()-1);
        }
    }
    
    private char[] lookUp(char num) {
        switch (num) {
            case '2':
                return new char[]{'a', 'b', 'c'};
            case '3':
                return new char[]{'d', 'e', 'f'};
            case '4':
                return new char[]{'g', 'h', 'i'};
            case '5':
                return new char[]{'j', 'k', 'l'};
            case '6':
                return new char[]{'m', 'n', 'o'};
            case '7':
                return new char[]{'p', 'q', 'r', 's'};
            case '8':
                return new char[]{'t', 'u', 'v'};
            case '9':
                return new char[]{'w', 'x', 'y', 'z'};
            default:
                return null;
        }
    }
}