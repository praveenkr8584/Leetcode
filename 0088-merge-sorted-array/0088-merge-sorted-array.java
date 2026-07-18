class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m+n;
        int[] mer=new int[x];
        int i=0,j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                mer[k++]=nums1[i++];
            }else{
                mer[k++]=nums2[j++];
            }
        }
        while(i<m){
            mer[k++]=nums1[i++];
        }
        while(j<n){
            mer[k++]=nums2[j++];
        }
        for (int p = 0; p < x; p++) {
            nums1[p] = mer[p];
        }

    }
}