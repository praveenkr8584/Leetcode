class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int n = s.length();
        String res = s.substring(0, 1);

        for (int i = 0; i < n; i++) {
            // Odd-length: single center at i
            String odd = expand(s, i, i);
            if (odd.length() > res.length()) res = odd;

            // Even-length: center between i and i+1
            String even = expand(s, i, i + 1);
            if (even.length() > res.length()) res = even;
        }
        return res;
    }

    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}