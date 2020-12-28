class Solution {
    public void solve(char[][] board) {
        
        if(board.length==0) {
           return;
        }

        for(int i = 0; i<board.length; i++) {
            dfs(board, i, 0);
            dfs(board, i, board[0].length-1);
        }
        for(int j = 0; j<board[0].length; j++) {
            dfs(board, 0, j);
            dfs(board, board.length-1, j);
        }

        int i = 0;
        while(i<board.length) {
            int j=0;
            while(j<board[0].length) {
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='t') board[i][j]='O';
                j++;
            }
            i++;
        }



    }

    public void dfs(char[][] board, int i, int j) {

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='X') return;

        if(board[i][j]=='O') {
            board[i][j] = 't';
            dfs(board, i+1, j);
            dfs(board, i-1, j);
            dfs(board, i, j-1);
            dfs(board, i, j+1);
        }


    }

}