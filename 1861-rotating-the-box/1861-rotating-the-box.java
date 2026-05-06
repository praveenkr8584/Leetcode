class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char[][] res=new char[n][m];
        // Step 1: Apply gravity (stones fall right)
        for (int i = 0; i < m; i++) {
            int empty = n - 1; // next available empty spot
            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    empty = j - 1; // reset empty spot boundary
                } else if (boxGrid[i][j] == '#') {
                    boxGrid[i][j] = '.';
                    boxGrid[i][empty] = '#';
                    empty--;
                }
            }
        }

        // Step 2: Rotate 90 degrees clockwise
        // res[j][m-1-i] = boxGrid[i][j]
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                res[j][m - 1 - i] = boxGrid[i][j];
        return res;
    }
}