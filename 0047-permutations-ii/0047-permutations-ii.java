class Solution {
    void solve(int[] nums, boolean[] visited,
               List<Integer> sub, List<List<Integer>> res) {

        if (sub.size() == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;
            sub.add(nums[i]);

            solve(nums, visited, sub, res);

            sub.remove(sub.size() - 1);
            visited[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        solve(nums, visited, sub, res);

        return res;
    }
}