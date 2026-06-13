class Solution {
    static int dfs(int i,int j,int[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return 1+dfs(i,j-1,grid)+dfs(i+1,j,grid)+dfs(i,j+1,grid)+dfs(i-1,j,grid);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=dfs(i,j,grid);
                    max_area=Math.max(max_area,area);
                }
            }
        }
        return max_area;
    }
}