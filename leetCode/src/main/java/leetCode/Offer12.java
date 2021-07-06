package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/6 21:49
 */
public class Offer12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (cal(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cal(char[][] board, char[] words, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != words[k]) {
            return false;
        }
        if (k == words.length - 1) {
            return true;
        }
        board[i][j] = ' ';
        boolean result = cal(board, words, i - 1, j, k + 1) || cal(board, words, i + 1, j, k + 1) || cal(board, words, i, j - 1, k + 1) || cal(board, words, i, j + 1, k + 1);
        board[i][j] = words[k];
        return result;
    }
}
