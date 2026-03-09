class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int co=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                co++;
                max=Math.max(co,max);
            }else{
                co=0;
            }
        }
        return max;
    }
}