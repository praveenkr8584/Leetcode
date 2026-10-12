class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        int rn=0;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]!=0){
                rn=nums[i];
            }else{
                arr[nums[i]]++;
            }
        }
        return rn;
    }
}