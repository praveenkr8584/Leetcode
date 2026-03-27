class Solution {
    int[][] mat1;
    public void rightshift(int[][] mat,int i,int n,int k){
        for(int j=0;j<n;j++){
            mat1[i][(j+k)%n]=mat[i][j];
        }
    }
    public void leftshift(int[][] mat,int i,int n,int k){
        for(int j=0;j<n;j++){
            mat1[i][(j - k + n) % n] = mat[i][j];
        }
    }
    public boolean equal(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=mat1[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        mat1=new int[m][n];
        k=k%n;
        for(int i=0;i<m;i++){
            if(i%2==0){
                leftshift(mat,i,n,k);
            }else{
                rightshift(mat,i,n,k);
            }
        }
        return equal(mat);

    }
}