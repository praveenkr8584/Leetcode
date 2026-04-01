class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int totalsum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                totalsum+=grid[i][j];
            }
        }
        if(totalsum %2 !=0){
            return false;
        }

        int target=totalsum/2;
        int currentsum=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                currentsum+=grid[i][j];
            }
            if(currentsum == target) return true;
        }

        currentsum=0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                currentsum+=grid[i][j];
            }
            if(currentsum == target) return true;
        }
        return false;

    }
}