//https://leetcode.com/problems/shortest-bridge/
class Solution {
    class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
    public int shortestBridge(int[][] grid) {
        List<List<Pair>> res = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    List<Pair> list = new ArrayList<>();
                    dfs(grid,i,j,list);
                    res.add(list);    
                }
            }
        }
        // System.out.println(res.size());
        // System.out.println(res);
        double min = Integer.MAX_VALUE;
        List<Pair> list1 = res.get(0);
        List<Pair> list2 = res.get(1);
        int minDist =Integer.MAX_VALUE;
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                int x1 = list1.get(i).i;
                int y1 = list1.get(i).j;
                int x2 = list2.get(j).i;
                int y2 = list2.get(j).j;
                if(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)) < min){
                    min = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
                // System.out.println(x1);       
                // System.out.println(y1);       
                // System.out.println(x2);       
                // System.out.println(y2);       
                    minDist = Math.abs(y2-y1) + Math.abs(x2-x1);
                }
            }
        }
        return minDist-1;
    }
    
    void dfs(int[][] grid,int i,int j,List<Pair> list){
        if(i==-1 || i== grid.length || j==-1||j==grid[0].length || grid[i][j] == 0){
            return;
        }
        list.add(new Pair(i,j));
        grid[i][j] = 0;
        dfs(grid,i+1,j,list);
        dfs(grid,i,j+1,list);
        dfs(grid,i-1,j,list);
        dfs(grid,i,j-1,list);
    }
}
