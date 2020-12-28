class Solution {
    public int numIslands(char[][] grid) {

        int i = 0, j = 0, result = 0;
        while(i<grid.length) {
            j=0;
            while(j<grid[0].length) {
                if(grid[i][j]=='1') {
                    dfs(grid, i, j);
                    result++;
                }
                j++;
            }
            i++;
        }
        return result;
    }

    public void dfs(char[][]grid, int i, int j) {

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1') {
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }

}