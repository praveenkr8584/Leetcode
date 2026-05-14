class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1; // base[n] has length n+1, so n = nums.length - 1
        int[] count = new int[n + 2];
        
        for (int num : nums) {
            if (num < 1 || num > n) return false;
            count[num]++;
        }
        
        // 1 to n-1 must appear exactly once, n must appear exactly twice
        for (int i = 1; i < n; i++) {
            if (count[i] != 1) return false;
        }
        
        return count[n] == 2;
    }
}