class Solution {
    public void solve(int[] nums,List<Integer> sub,List<List<Integer>> res,int start){
        res.add(new ArrayList<>(sub));  // ✅ Add a copy
        for(int i=start;i<nums.length;i++){
            sub.add(nums[i]);
            solve(nums,sub,res,i+1);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        solve(nums,sub,res,0);
        return res;
    }
}