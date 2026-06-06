class Solution {
    boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int t = 0;
        for (int num : nums) t += num;
        if (t % 2 != 0) return false;
        t /= 2;

        dp = new boolean[nums.length + 1][t + 1];
        for (boolean[] x : dp) x[0] = true;  // sum=0 is always achievable

        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j < t + 1; j++) {
                dp[i][j] = dp[i-1][j];
                if (nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
                }
            }
        }
        return dp[nums.length][t];
    }
}