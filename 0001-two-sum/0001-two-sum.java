class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            int iff = target - nums[i];
            if (hs.containsKey(iff)) {
                x = hs.get(iff);
                y = i;
                break;

            } else {
                hs.put(nums[i], i);
            }
        }
        return new int[] { x, y };
    }
}