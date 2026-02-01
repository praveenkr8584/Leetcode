class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;

        // Step 1: Build suffix minimum array
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // Step 2: Find minimum nums[i] + nums[j]
        int minSum = Integer.MAX_VALUE;

        for (int i = 1; i < n - 1; i++) {
            minSum = Math.min(minSum, nums[i] + suffixMin[i + 1]);
        }

        // Step 3: Add nums[0]
        return nums[0] + minSum;
    }
}
