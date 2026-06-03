class Solution {
    int[] dp;

    int solve(int n, int start,int[] nums) {
        if (n == start)
            return 0;
        if (n == start+1)
            return nums[start];
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = Math.max(nums[n - 1] + solve(n - 2,start, nums), solve(n - 1, start, nums));
    }

    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        dp=new int[nums.length+1];
        Arrays.fill(dp, -1);
        int x=solve(nums.length, 1, nums);
        Arrays.fill(dp, -1);
        int y=solve(nums.length-1, 0, nums);
        return Math.max(x,y);
    }
}