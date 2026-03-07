class Solution {
    int[] r;
    public int climbStairs(int n) {
        r=new int[n+1];
        Arrays.fill(r,-1);
        r[0]=1;
        r[1] =1;
        return climb(n);
    }
    public int climb(int n){
            if(r[n]!=-1){
                return r[n];
            }
            r[n]=climb(n-1)+climb(n-2);
            return r[n];
    }
    
}