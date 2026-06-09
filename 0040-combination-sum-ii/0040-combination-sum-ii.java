class Solution {
    void solve(int[] nums,List<Integer> sub,List<List<Integer>> res,int target,int start){
        System.out.println(sub);
        if(target==0){
            // Collections.sort(sub);
            if(!res.contains(sub)){
                res.add(new ArrayList<>(sub));
            }
        }
        if(target<0){
                return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            sub.add(nums[i]);
            solve(nums,sub,res,target-nums[i],i+1);
            sub.remove(sub.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,sub,res,target,0);
        return res;
    }
}