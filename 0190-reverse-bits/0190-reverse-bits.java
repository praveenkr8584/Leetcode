public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev=0;
        int k=32;
        
        while (k > 0) {
            rev = (rev << 1) | (n & 1); // Shift rev left and add LSB of n
            n = n >> 1; // Right shift n
            k--;
        }
        return rev;
    }
}