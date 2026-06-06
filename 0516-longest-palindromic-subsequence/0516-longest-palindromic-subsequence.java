class Solution {
    // static int solve(int i,int j,String s){
    //     if(i>j)return 0;
    //     if(i==j){
    //         return 1+solve(i+1,j-1,s);
    //     }else if(s.charAt(i)==s.charAt(j)){
    //         return 2+solve(i+1,j-1,s);
    //     }
    //     return Math.max(solve(i+1,j,s),solve(i,j-1,s));

    // }
    public int longestPalindromeSubseq(String text1) {
        int m = text1.length();
        int n=m;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text1.charAt(m-1-j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1 + dp[i-1][j-1];
                    }
                } else {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 0;
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j-1];
                    } else if (j == 0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }

        return dp[m-1][n-1];
    }
}