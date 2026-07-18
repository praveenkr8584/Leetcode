import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length < 3) return new ArrayList<>();
        int n = nums.length;
        Set<List<Integer>> hs=new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[r]+nums[l];
                if(sum==0){
                    hs.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        List<List<Integer>> mls=new ArrayList<>();
        for(List l:hs){
            mls.add(l);
        }

        return mls;
    }
}
