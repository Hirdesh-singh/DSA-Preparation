class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid,n,m);
                    count++;

                }
               
            }
        }
        return count;

    }
    public void dfs(int r, int c, char[][] grid, int n, int m){
        if(r<0 || r>=n || c<0 || c>=m || grid[r][c] !='1'){
            return;
        }
        grid[r][c]=0;
        dfs(r+1,c,grid,n,m);
        dfs(r-1,c,grid,n,m);
        dfs(r,c+1,grid,n,m);
        dfs(r,c-1,grid,n,m);
    }
}