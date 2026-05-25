class Solution {
    public int helper(int[] nums,int n){
        if(n==1){
            return nums[0];
        }
        int x=0;
        int j=0;
        for(int i=0;i<n;i+=2){
            if(x==0){
                nums[j++]=Math.min(nums[i],nums[i+1]);
                x=1;
            }else{
                nums[j++]=Math.max(nums[i],nums[i+1]);
                x=0;
            }
        }
        return helper(nums,n/2);
    }
    public int minMaxGame(int[] nums) {
        return helper(nums,nums.length);
    }
}