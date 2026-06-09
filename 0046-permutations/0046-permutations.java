class Solution {
    void solve(int[] nums,List<Integer> sub,List<List<Integer>> res){
        if(sub.size()==nums.length){
            res.add(new ArrayList<>(sub));
        }
        for(int num:nums){
            if(sub.contains(num))continue;
            sub.add(num);
            solve(nums,sub,res);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        solve(nums,sub,res);
        return res;
    }
}