// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] vis = new boolean[V];
        dfs(adj,list,vis,0);
        return list;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> list,boolean[] vis,int src){
        list.add(src);    
        vis[src] = true;
        for(int neighbour:adj.get(src)){
            if(!vis[neighbour]){
                
                dfs(adj,list,vis,neighbour);
            }
        }
    }
}