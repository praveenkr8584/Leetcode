class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int minm=Integer.MAX_VALUE;
        int maxm=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            minm=Math.min(minm,nums[i]);
            maxm=Math.max(maxm,nums[i]);
            hs.add(nums[i]);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=minm;i<maxm;i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}