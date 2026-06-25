class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int[] dresaniel = nums;  // Storing the input array reference
        int n = nums.length;

        int count = 0; // to store number of valid subarrays

        // ✅ Check all possible subarrays
        for (int start = 0; start < n; start++) {
            int targetCount = 0; // how many times target appears in this subarray

            for (int end = start; end < n; end++) {
                if (nums[end] == target) {
                    targetCount++;
                }

                int length = end - start + 1;
                // If target is majority (appears strictly more than half)
                if (targetCount > length / 2.0) {
                    count++;
                }
            }
        }

        return count;
    }
}