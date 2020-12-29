class Solution {
    public void gameOfLife(int [][] board) {

        int [][] result = new int [board.length][board[0].length];

        int r=0;
        while(r<board.length) {
            int c = 0;
            while(c<board[0].length) {
                int neighbours = sumOfNeighbours(board, r, c);
                if(board[r][c]==1) {
                    if(neighbours<2) result[r][c]=0;
                    else if(neighbours>3) result[r][c]=0;
                    else result[r][c] = 1;
                }
                else {
                    if(neighbours==3) result[r][c]=1;
                    
                }
                c++;
            }
            r++;
        }
        r=0;
        while(r<board.length) {
            int c=0;
            while(c<board[0].length) {
                board[r][c] = result[r][c];
                c++;
            }
            r++;
        }
    }

    public int sumOfNeighbours(int [][]board, int r, int c) {

        int result = 0;
        if(r>0) if(board[r-1][c]==1) result++;
        if(r<board.length-1) if(board[r+1][c]==1) result++;	
        if(c>0) if(board[r][c-1]==1) result++;	
        if(c<board[0].length-1) if(board[r][c+1]==1) result++;	
        if(r>0&&c>0) if(board[r-1][c-1]==1) result++;	
        if(r<board.length-1 && c<board[0].length-1) if(board[r+1][c+1]==1) result++;	
        if(r>0&&c<board[0].length-1) if(board[r-1][c+1]==1) result++;	
        if(r<board.length-1 && c>0) if(board[r+1][c-1]==1) result++;	

        return result;
    }

}