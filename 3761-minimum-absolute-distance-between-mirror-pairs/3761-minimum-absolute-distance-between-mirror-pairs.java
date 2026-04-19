class Solution {
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return reversed;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int rev = reverseDigits(nums[i]);

            // ONLY check: reverse(nums[j]) == nums[i]
            if (map.containsKey(nums[i])) {
                minDist = Math.min(minDist, i - map.get(nums[i]));
            }

            // store reverse(nums[i]) as key
            map.put(rev, i);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}