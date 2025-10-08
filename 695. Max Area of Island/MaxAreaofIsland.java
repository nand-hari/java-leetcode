class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0 ;
        for(int i = 0 ;i < row ; i++){
            for(int j =0 ; j<col ;j++){
                if(grid[i][j]==1){
                   maxArea = Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
        
    }

    public int dfs(int[][] grid , int row , int col){
        if(row <0 || col < 0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }

        grid[row][col]=0;
        int len =1;
        len = len +dfs(grid, row+1,col);
        len = len +dfs(grid, row-1,col);
        len = len +dfs(grid, row,col+1);
        len = len +dfs(grid, row,col-1);
        return len;
    }
}
