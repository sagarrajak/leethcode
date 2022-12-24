class Solution {
    public int dfs(int i, int j, int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int sum = 0;
        grid[i][j] = -1;
        if (i+1 < r) { 
            if(grid[i+1][j] > 0)
                sum += dfs(i+1, j, grid);
            else if(grid[i+1][j] == 0) 
                sum += 1;
        } else {
            sum += 1;
        }


        if (j+1 < c) { 
            if(grid[i][j+1] > 0)
                sum += dfs(i, j+1, grid);
            else if(grid[i][j+1] == 0) 
                sum += 1;
        }
         else {
            sum += 1;
        }

        if (i-1 >= 0) { 
            if(grid[i-1][j] > 0)
                sum += dfs(i-1, j, grid);
            else if(grid[i-1][j] == 0) 
                sum += 1;
        }
         else {
            sum += 1;
        }

         if (j-1 >= 0) { 
            if(grid[i][j-1] > 0)
                sum += dfs(i, j-1, grid);
            else if(grid[i][j-1] == 0) 
                sum += 1;
        }
         else {
            sum += 1;
        }

        return sum;
    }


    public int islandPerimeter(int[][] grid) {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] > 0) {
                    return this.dfs(i, j, grid);
                }
            }
         }
         return 0;
    }
}
