class Solution {
    public int gc(int a, int b) {
        return a == 0 ? b : gc(b % a, a);
    }
    public int findGCD(int[] nums) {
        int min_n=Integer.MAX_VALUE;
        int max_n=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min_n=Math.min(min_n,nums[i]);
            max_n=Math.max(max_n,nums[i]);
        }
        return gc(min_n,max_n);
    }
}