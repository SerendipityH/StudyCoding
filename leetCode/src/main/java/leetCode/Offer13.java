package leetCode;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/7/7 9:00
 */
public class Offer13 {
    public int movingCount(int m, int n, int k) {
        boolean arr[][] = new boolean[m][n];
        return dfs(arr, m, n, k, 0, 0);
    }

    public int dfs(boolean arr[][], int m, int n, int k, int i, int j) {
        if (i >= m || j >= n || cal(i) + cal(j) > k || arr[i][j]) {
            return 0;
        }
        arr[i][j] = true;
        return 1 + dfs(arr, m, n, k, i + 1, j) + dfs(arr, m, n, k, i, j + 1);
    }

    public int cal(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
