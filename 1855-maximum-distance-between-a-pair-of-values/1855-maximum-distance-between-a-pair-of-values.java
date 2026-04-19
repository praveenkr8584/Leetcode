class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max_d=0;
        int i=0 , j = 0 ;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j] && i<=j){
                max_d=Math.max(max_d,(j-i));
                j++;
            }else if(nums1[i]>nums2[j]){
                i++;
                if(i>j){
                    j=i;
                }
            }
        }
        return max_d;
    }
}