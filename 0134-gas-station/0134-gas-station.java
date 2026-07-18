class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;   // Total net gas across all stations
        int tank = 0;    // Current gas in tank
        int start = 0;   // Potential starting index

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            // If tank < 0, we can’t reach the next station
            if (tank < 0) {
                start = i + 1;  // Try the next station as a new start
                tank = 0;       // Reset tank
            }
        }

        // If total gas < total cost, impossible to complete circuit
        return (total < 0) ? -1 : start;
    }
}
