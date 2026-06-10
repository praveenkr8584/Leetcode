class Solution {
    static boolean isSafe(int row,int col,char[][] board){
        // column
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // upper - left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        // upper-right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void backtrack(int row,List<List<String>> res,char[][] board){
        if(row==board.length){
            List<String> sol=new ArrayList<>();
            for(char[] boardRow:board){
                String rowStr =new String(boardRow);
                sol.add(rowStr);
            }
            res.add(sol);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                backtrack(row+1,res,board);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] x:board) Arrays.fill(x,'.');
        backtrack(0,res,board);
        return res;
    }
}