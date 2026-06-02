class Solution {
    static int[] x=new int[46];
    static{
        Arrays.fill(x,-1);
    }
    public int climbStairs(int n) {
        if(n<=2)return n;
        if(x[n]!=-1)return x[n];
        return x[n]=climbStairs(n-1)+climbStairs(n-2);
    }
}