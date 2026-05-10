class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);   // -1 means "unreachable"
        dp[0] = 0;             // start at index 0 with 0 jumps

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                // Can we jump from i to j?
                int diff = nums[j] - nums[i];
                if (dp[i] != -1 && diff >= -target && diff <= target) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        return dp[n - 1];
    }
}