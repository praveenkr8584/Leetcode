class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxp=Integer.MIN_VALUE;
        int p=1;
        for(int i=0;i<n;i++){
            p*=nums[i];
            maxp=Math.max(maxp,p);
            if(p==0){
                p=1;
            }
        }
        int p2=1;
        for(int i=n-1;i>=0;i--){
            p2*=nums[i];
            maxp=Math.max(maxp,p2);
            if(p2==0){
                p2=1;
            }
        }
        return maxp;
    }
}