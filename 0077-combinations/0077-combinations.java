class Solution {
        void solve(int start,int[] nums,List<Integer> sub,List<List<Integer>> res,int k){
        if(sub.size()==k){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=start;i<nums.length;i++){
            sub.add(nums[i]);
            solve(i+1,nums,sub,res,k);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        int j=1;
        for(int i=0;i<n;i++){
            nums[i]=j++;
        }
        List<Integer> sub=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,sub,res,k);
        return res;
    }
}