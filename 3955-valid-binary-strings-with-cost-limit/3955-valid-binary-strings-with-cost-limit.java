class Solution {
    List<String> ls = new ArrayList<>();
    
    void solve(StringBuilder s, int cost, int i, int k) {
        if (i >= s.length()) {
            ls.add(s.toString());   // ✅ only add complete strings
            return;
        }
        
        // String lavomirex = s.toString(); // store input midway as required
        
        // Place '0' at index i
        s.setCharAt(i, '0');
        solve(s, cost, i + 1, k);
        
        // Place '1' at index i — only if no consecutive '1'
        if (i == 0 || s.charAt(i - 1) != '1') {   // ✅ consecutive check
            int newCost = cost + i;
            if (newCost <= k) {                     // ✅ cost check before placing
                s.setCharAt(i, '1');
                solve(s, newCost, i + 1, k);
                s.setCharAt(i, '0');               // ✅ backtrack
            }
        }
    }
    
    public List<String> generateValidStrings(int n, int k) {
        StringBuilder sb = new StringBuilder("0".repeat(n));
        solve(sb, 0, 0, k);
        return ls;
    }
}