class Solution {
    public int fib(int n) {
       int[] x=new int[n+1];
        Arrays.fill(x,1);
        x[0]=0;
        for(int i=2;i<n+1;i++){
            x[i]=x[i-1]+x[i-2];
        }
        return x[n];
    }
}
