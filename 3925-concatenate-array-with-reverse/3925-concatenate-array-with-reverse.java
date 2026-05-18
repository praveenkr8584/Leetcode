class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[nums.length *2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int j=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            ans[j++]=nums[i];
        }
        return ans;
    }
}