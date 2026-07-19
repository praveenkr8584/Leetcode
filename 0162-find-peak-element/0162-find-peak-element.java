class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // peak is in left half (including mid)
                h = mid;
            } else {
                // peak is in right half
                l = mid + 1;
            }
        }
        return l; // l == h, peak found
    }
}
