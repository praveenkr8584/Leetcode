import java.util.*;

class Solution {

    HashSet<Character>[] row = new HashSet[9];
    HashSet<Character>[] col = new HashSet[9];
    HashSet<Character>[] box = new HashSet[9];
    List<int[]> empty = new ArrayList<>();

    public void solveSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        // Initialize sets and empty cells
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    empty.add(new int[]{r, c});
                } else {
                    char num = board[r][c];
                    row[r].add(num);
                    col[c].add(num);
                    box[(r / 3) * 3 + (c / 3)].add(num);
                }
            }
        }

        solve(0, board);
    }

    private boolean solve(int i, char[][] board) {

        if (i == empty.size())
            return true;

        int r = empty.get(i)[0];
        int c = empty.get(i)[1];
        int b = (r / 3) * 3 + (c / 3);

        for (char num = '1'; num <= '9'; num++) {

            if (!row[r].contains(num) &&
                !col[c].contains(num) &&
                !box[b].contains(num)) {

                board[r][c] = num;
                row[r].add(num);
                col[c].add(num);
                box[b].add(num);

                if (solve(i + 1, board))
                    return true;

                board[r][c] = '.';
                row[r].remove(num);
                col[c].remove(num);
                box[b].remove(num);
            }
        }

        return false;
    }
}