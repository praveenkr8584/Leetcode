class Solution {
    TreeMap<Integer, Integer> small = new TreeMap<>();
    TreeMap<Integer, Integer> large = new TreeMap<>();
    long smallSum = 0;
    int smallSize = 0, largeSize = 0;
    int need;

    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        need = k - 1;
        long ans = Long.MAX_VALUE;

        // initial window
        for (int i = 1; i <= Math.min(n - 1, 1 + dist); i++) {
            addSmall(nums[i]);
        }
        rebalance();

        if (smallSize == need) ans = smallSum;

        for (int i1 = 2; i1 < n; i1++) {
            int removeIdx = i1 - 1;
            int addIdx = i1 + dist;

            // remove outgoing
            if (small.containsKey(nums[removeIdx])) {
                removeSmall(nums[removeIdx]);
            } else {
                removeLarge(nums[removeIdx]);
            }

            // add incoming
            if (addIdx < n) {
                int x = nums[addIdx];
                if (!small.isEmpty() && x <= small.lastKey()) {
                    addSmall(x);
                } else {
                    addLarge(x);
                }
            }

            rebalance();
            if (smallSize == need) ans = Math.min(ans, smallSum);
        }

        return ans + nums[0];
    }

    private void rebalance() {
        while (smallSize > need) {
            int x = small.lastKey();
            removeSmall(x);
            addLarge(x);
        }
        while (smallSize < need && largeSize > 0) {
            int x = large.firstKey();
            removeLarge(x);
            addSmall(x);
        }
    }

    private void addSmall(int x) {
        small.put(x, small.getOrDefault(x, 0) + 1);
        smallSize++;
        smallSum += x;
    }

    private void removeSmall(int x) {
        if (small.get(x) == 1) small.remove(x);
        else small.put(x, small.get(x) - 1);
        smallSize--;
        smallSum -= x;
    }

    private void addLarge(int x) {
        large.put(x, large.getOrDefault(x, 0) + 1);
        largeSize++;
    }

    private void removeLarge(int x) {
        if (large.get(x) == 1) large.remove(x);
        else large.put(x, large.get(x) - 1);
        largeSize--;
    }
}
