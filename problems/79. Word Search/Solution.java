class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (helper(board, wordArray, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, char[] word, int i, int j, int index) {
        // If a combination which starts at board[i][j] matched word[index:], return
        // true.

        if (index == word.length) {
            return true;
        }

        // If i and j is not valid, exit;
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
            return false;
        }
        if (board[i][j] != word[index]) {
            return false;
        } else {
            // Now we can search its neighbors. But we have to mark it as visited.
            // We can make it a char that will never in our dictionary.
            board[i][j] = 0;
            if (helper(board, word, i + 1, j, index + 1) || helper(board, word, i - 1, j, index + 1)
                    || helper(board, word, i, j + 1, index + 1) || helper(board, word, i, j - 1, index + 1)) {
                return true;
            }
            board[i][j] = word[index];
            return false;
        }
    }
}