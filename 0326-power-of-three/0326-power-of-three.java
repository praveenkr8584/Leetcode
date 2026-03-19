class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        double p = Math.log10(n) / Math.log10(3);
        return Math.abs(p - Math.round(p)) < 1e-10;
    }
}