class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] a=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                a[k++]=nums1[i++];
            }else{
                a[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            a[k++]=nums1[i++];
        }
        while(j<nums2.length){
            a[k++]=nums2[j++];
        }
        float result=0;
        if(a.length%2==0){
            result=(float)(a[a.length/2]+a[a.length/2-1])/2;
        }else{
            result=(float)a[a.length/2];
        }
        return result;
    }
}