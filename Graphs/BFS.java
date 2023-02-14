// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];
        q.add(0);
        list.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int src = q.poll();
               
               
                for(int neigh: adj.get(src)){
                    if(!vis[neigh]){
                        vis[neigh] = true;
                        q.add(neigh);
                        list.add(neigh);
                }    
                // System.out.println(neigh);
                
            }
        }
        }
        return list;
        
    }
}