class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long pro=1;
        int[][] result=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=(int)pro;
                pro=(grid[i][j] * pro)%12345;
            }
        }
        pro=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                result[i][j]=(int)(result[i][j]*pro)%12345;
                pro=(pro*grid[i][j])%12345;
            }
        }
        return result;
    }
}