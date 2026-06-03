class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) Arrays.fill(row, -1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    memo[i][j]=1;
                }else{
                    memo[i][j]=memo[i-1][j]+memo[i][j-1];
                }
            }
        }
        return memo[m-1][n-1];
    }
}