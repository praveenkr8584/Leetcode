class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int l = 0;
        int n = nums.length;
        int mls = 0;

        HashMap<Integer, Integer> f = new HashMap<>();

        while (j < n) {

            f.put(nums[j], f.getOrDefault(nums[j], 0) + 1);
            l++;

            while (f.get(nums[j]) > k) {
                f.put(nums[i], f.get(nums[i]) - 1);
                i++;
                l--;
            }

            mls = Math.max(mls, l);
            j++;
        }

        return mls;
    }
}