class Solution {
    public void solve(int[] nums, List<Integer> sub, List<List<Integer>> res, int start) {
        res.add(new ArrayList<>(sub));
        for (int i = start; i < nums.length; i++) {
            // ✅ Skip duplicate values at the same level
            if (i > start && nums[i] == nums[i - 1]) continue;
            sub.add(nums[i]);
            solve(nums, sub, res, i + 1);
            sub.remove(sub.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // ✅ Must sort first
        ArrayList<Integer> sub=new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, sub, res, 0);  
        return res;
    }
}