class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (int task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> tas = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) tas.offer(f);
        }

        int time = 0;
        while (!tas.isEmpty()) {
            ArrayList<Integer> seq = new ArrayList<>();
            int cycleTaskCount = 0;           // ✅ track ALL tasks processed this cycle

            for (int i = 0; i <= n; i++) {
                if (!tas.isEmpty()) {
                    cycleTaskCount++;         // ✅ count it regardless of remaining freq
                    int top = tas.poll() - 1;
                    if (top > 0) seq.add(top);
                }
            }

            for (Integer x : seq) tas.offer(x);

            // ✅ use cycleTaskCount instead of seq.size()
            time += tas.isEmpty() ? cycleTaskCount : n + 1;
        }
        return time;
    }
}