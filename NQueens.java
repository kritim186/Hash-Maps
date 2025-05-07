import java.util.*;
class NQueens{

    private static List<List<String>> nQueens(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] ch:board){
            Arrays.fill(ch, '.');
        }

        solve(0, board, ans, n);
        return ans;
    } 
    
    private static void solve(int row, char[][] board, List<List<String>> ans, int n){
        if(row == n){
            ans.add(constructBoard(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                solve(row+1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col,  int n){
        for (int i = row-1; i >= 0; i--) {
            if(board[col][i] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    private static List<String> constructBoard(char[][] board){
        List<String> list = new ArrayList<>();

        for(char[] row: board){
            list.add(new String(row));
        }
        return list;
    }
    public static void main(String[] args) {
        
    }
}