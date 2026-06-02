class Solution {
    int[] dp;

    int solve(int n, int[] nums) {
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        if (dp[n] != -1) return dp[n];

        return dp[n] = Math.max(
                nums[n - 1] + solve(n - 2, nums),
                solve(n - 1, nums)
        );
    }

    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(nums.length, nums);
    }
}