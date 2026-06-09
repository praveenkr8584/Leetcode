class Solution {
    void solve(int[] nums,List<Integer> sub,List<List<Integer>> res,int target,int start){
        if(target==0){
            res.add(new ArrayList<>(sub));
        }
        for(int i=start;i<nums.length;i++){
            if(target-nums[i]<0){
                continue;
            }
            sub.add(nums[i]);
            solve(nums,sub,res,target-nums[i],i);
            sub.remove(sub.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        solve(candidates,sub,res,target,0);
        return res;
    }
}