//leetcode.com/problems/number-of-islands/
class Solution {

    public int numIslands(char[][] grid) {

        int c = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    System.out.println(i + " " + j);
                    c++;
                    dfs(grid,i,j);
                }
            }
        }    
        return c;

    }
    void dfs(char[][] grid,int i,int j){
        if( ((i==grid.length || i<0) || (j==grid[0].length || j<0)) || grid[i][j] == '0'){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        }
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
    }
}
