class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]==target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
       
        int l = 0, h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left side is sorted
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // Right side is sorted
            else {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
}
    

                
                
                