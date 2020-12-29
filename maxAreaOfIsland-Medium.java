class Solution {
    int tempArea = 0;

    public int maxAreaOfIsland(int [][] grid) {

        int result = 0, r=0, c=0;

        while(r<grid.length) {
            c=0;
            while(c<grid[0].length) {
                if(grid[r][c]==1) {
                    tempArea = 0;
                    dfs(grid, r, c);
                    result = Math.max(result, tempArea);
                }
                c++;
            }
            r++;
        }
        return result;
    }

    public void dfs(int [][] grid, int r, int c) {

        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return;

        if(grid[r][c]==1) {
            grid[r][c] = 0;
            tempArea++;
            dfs(grid, r+1, c);
            dfs(grid, r-1, c);
            dfs(grid, r, c-1);
            dfs(grid, r, c+1);
        }

    }

}