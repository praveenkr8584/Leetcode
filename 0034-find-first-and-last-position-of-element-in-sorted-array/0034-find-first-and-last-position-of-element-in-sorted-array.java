class Solution {
    public static int index(int[] a,int l,int h,int target){
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == target) {
                h=mid-1;
            }else if(a[mid]>target){
                h=mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        return h;
    }
    public static int index2(int[] a,int l,int h,int target){
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == target) {
                l=mid+1;

            }else if(a[mid] >target){
                h=mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int li=-1;
        int hi=-1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                li=mid+1;
                hi=mid-1;
                int first=index(nums,l, hi, target);
                int last=index2(nums,li,h,target);
                li=first+1;
                hi=last-1;
                break;

            }else if(nums[mid] > target) {
                h = mid - 1;
            }else{
                l=mid+1;
            }
        }
        int[] result=new int[2];
        result[0]=li;
        result[1]=hi;
        return result;
    }
}