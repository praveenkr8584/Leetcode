class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ls = new ArrayList<>(); // Correct instantiation of List
        
        if (arr == null || arr.length == 0) return ls; // Handle empty matrix case
        
        int r = arr.length - 1;
        int c = arr[0].length - 1;
        int rs = 0;
        int cs = 0;

        while (rs <= r && cs <= c) {
            // Traverse from left to right
            for (int k = cs; k <= c; k++) {
                ls.add(arr[rs][k]);
            }
            rs++;

            // Traverse from top to bottom
            for (int k = rs; k <= r; k++) {
                ls.add(arr[k][c]);
            }
            c--;

            // Traverse from right to left (only if still in bounds)
            if (rs <= r) {
                for (int k = c; k >= cs; k--) {
                    ls.add(arr[r][k]);
                }
                r--;
            }

            // Traverse from bottom to top (only if still in bounds)
            if (cs <= c) {
                for (int k = r; k >= rs; k--) {
                    ls.add(arr[k][cs]);
                }
                cs++;
            }
        }

        return ls;
    }
}