class Solution {
    public int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (array[i] == ' ') {
                if (result == 0) {
                    continue;
                } else {
                    return result;
                }
            } else {
                result++;
            }
        }
        return result;
    }
}