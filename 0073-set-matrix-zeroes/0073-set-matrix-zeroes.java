class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int x:row){
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[x][i]!=0){
                    matrix[x][i]=0;
                }
            }
        }
        for(int y:col){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][y]!=0){
                    matrix[i][y]=0;
                }
            }
        }
    }
}