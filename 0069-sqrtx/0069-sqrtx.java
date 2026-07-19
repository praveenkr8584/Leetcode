class Solution {
    public int mySqrt(int x) {
        // Handle edge cases for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }

        int l = 1; // Start from 1 since sqrt(0) and sqrt(1) are trivial
        int h = x;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            // Avoid potential overflow by using division instead of multiplication
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return h; // Return the integer part of sqrt
    }
}