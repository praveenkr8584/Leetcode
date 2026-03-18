class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int maxi=0;

        for(int i =0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            pref[i] = gc(maxi,nums[i]);
        }

        Arrays.sort(pref);
        long total = 0;
        for(int i=0;i<n/2;i++){
            total += gc(pref[i],pref[n-i-1]);
        }
        return total;
    }

    private int gc(int a,int b){
        return b!=0?gc(b,a%b):a;
    }
}