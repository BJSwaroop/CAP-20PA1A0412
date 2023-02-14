// https://leetcode.com/problems/number-of-operations-to-make-network-connected/

class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1)return -1;
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
                int u = connections[i][0];
                int v = connections[i][1];

                graph.get(u).add(v);
                graph.get(v).add(u);
        }   
        int disCon = 0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                disCon++;
                dfs(graph,i,vis);
            }
 
 
        }
        return disCon - 1;
    }
    void dfs(List<List<Integer>> graph,int src,boolean[] vis){
        vis[src] = true;
        for(int neigh: graph.get(src)){
            if(!vis[neigh]){
                dfs(graph,neigh,vis);
            }
        }
    }
    
}
