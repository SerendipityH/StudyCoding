package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/6/29 8:23
 */
public class Offer04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int x = matrix.length;
        int y = matrix[0].length;
        int i = x - 1;
        int j = 0;
        while (i >= 0 && j < y) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            }

        }
        return false;
    }

    public static void main(String[] args) {

    }
}
