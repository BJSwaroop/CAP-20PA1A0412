//https://leetcode.com/problems/course-schedule/
class Solution {
    boolean cycle = false;
    public boolean canFinish(int n, int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            int u = p[i][0];
            int v = p[i][1];
            adj.get(u).add(v);
        }
        boolean[] vis = new boolean[n];
        boolean[] revis = new boolean[n];
        System.out.println(adj);
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adj,vis,revis,i);
                if(cycle){
                    return false;
                }
            }
        }
        return true;
    }
    void dfs(List<List<Integer>> adj,boolean[] vis,boolean[] revis,int src){
        if(revis[src]){
            cycle = true;
        }
        vis[src] = true;
        revis[src] = true;
        for(int neigh:adj.get(src)){
            if(!vis[neigh]){
                dfs(adj,vis,revis,neigh);
            }
            if(revis[neigh]){
                cycle = true;
            }
        }
        revis[src] = false;
        System.out.print(revis[src]);
    }
}
