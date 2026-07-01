class Solution {
    public int removeElement(int[] nums, int val) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[op++]=nums[i];
            }
        }
        return op;
    }
}