class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        if(n==1){
            return -1;
        }
        long totalsum=0;
        long sufpro=1;
        for(int x:nums){
            totalsum+=x;
        }
        long pre=totalsum-nums[n-1];
        for(int i=n-1;i>=0;i--){
            if(sufpro>totalsum){
                break;
            }
            if(pre==sufpro){
                return i;
            }
            if(i==0){
                break;
            }
            pre-=nums[i-1];
            sufpro*=nums[i];

        }
        return -1;
    }
}