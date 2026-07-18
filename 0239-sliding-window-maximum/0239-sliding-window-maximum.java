class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] res = new int[n - k + 1];
        int j = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Window is complete
            if (i >= k - 1) {
                res[j++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}