class Solution {
    public int helper(int i, int j, int m, int n, int[][] memo) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        if (memo[i][j] != -1) return memo[i][j];

        memo[i][j] = helper(i + 1, j, m, n, memo)
                   + helper(i, j + 1, m, n, memo);
        return memo[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) Arrays.fill(row, -1);
        return helper(0, 0, m, n, memo);
    }
}