//https://leetcode.com/problems/keys-and-rooms/
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v = rooms.size();
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(rooms,vis,0);
            }
        }
        for(int i=0;i<v;i++){
            System.out.println(vis[i]);
            if(vis[i] ==false){
                return false;
            } 
        }
        return true;
        
    }
    void dfs(List<List<Integer>> rooms, boolean[] vis, int src){
        vis[src] = true;
        for(int neigh:rooms.get(src)){
            if(!vis[neigh]){
                dfs(rooms,vis,neigh);
            }
        }
    }
}
