import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] x = new int[intervals.length][2];
        int s = 0;

        x[s] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= x[s][1]) {
                x[s][1] = Math.max(x[s][1], intervals[i][1]);
            } else {
                s++;
                x[s] = intervals[i];
            }
        }

        return Arrays.copyOf(x, s + 1);
    }
}
