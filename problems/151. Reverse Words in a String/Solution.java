public class Solution {
    // Time O(N), Space O(N)
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder result = new StringBuilder("");
        StringBuilder thisWord;
        int ptr = 0;

outerLoop:
        while (ptr < s.length()) {
            while (s.charAt(ptr) == ' ') {
                ptr++;
                if (ptr >= s.length()) {
                    break outerLoop;
                }
            }
            thisWord = new StringBuilder("");
            while (s.charAt(ptr) != ' ') {
                thisWord = thisWord.append(s.charAt(ptr++));
                if (ptr >= s.length()) {
                    break;
                }
            }
            thisWord = thisWord.append(' ');
            result = thisWord.append(result);
        }
        if (result.length() == 0) {
            return "";
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}