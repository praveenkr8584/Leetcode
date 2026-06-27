class Solution {
    public int reverse(int x) {
        int n = 0;
        if (x < 0) {
            n = 1;
        }

        int num = Math.abs(x);
        int res = 0;

        while (num > 0) {
            int r = num % 10;

            // Overflow check before multiplying
            if (res > (Integer.MAX_VALUE - r) / 10) {
                return 0; // overflow case
            }

            res = res * 10 + r;
            num = num / 10;
        }

        // If originally negative, make it negative again
        if (n == 1) {
            res = -res;
        }

        return res;
    }
}
