class Solution {
    public double helper(double x, long m) {
        if (m == 0) return 1;
        if (m % 2 == 0) {
            double half = helper(x, m / 2);
            return half * half;         // x^m = (x^(m/2))^2
        } else {
            return x * helper(x, m - 1); // x^m = x * x^(m-1)
        }
    }

    public double myPow(double x, int n) {
        long new_n = Math.abs((long) n);  // cast to long to handle Integer.MIN_VALUE
        double power = helper(x, new_n);
        return n >= 0 ? power : 1 / power;
    }
}