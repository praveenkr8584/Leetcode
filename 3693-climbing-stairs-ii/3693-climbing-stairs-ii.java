class Solution {
    int[] dp;
    int solve(int i,int[] costs){
        int n= costs.length;
        if(i>=n-1)return 0;
        if(dp[i+1]!=-1)return dp[i+1];
        int mini=Integer.MAX_VALUE;
        for(int j=i+1;j<=Math.min(i+3,n-1);j++){
            mini=Math.min(mini,(j-i)*(j-i)+costs[j]+solve(j,costs));
        }
        return dp[i+1]=mini;
    }
    public int climbStairs(int n, int[] costs) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(-1, costs);
    }
}