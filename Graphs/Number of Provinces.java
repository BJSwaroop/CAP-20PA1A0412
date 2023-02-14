// https://leetcode.com/problems/number-of-provinces/
class Solution {
    public int findCircleNum(int[][] isConnected) {

        int c = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j< isConnected[0].length;j++){
                if(isConnected[i][j] == 1){

                list.get(i).add(j);
                list.get(j).add(i);
                }
            }
        }
        boolean[] vis = new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                c++;
                dfs(list,i,vis);
            }
        }
        return c;
    }
    void dfs(List<List<Integer>> list,int src,boolean[] vis){
        
        vis[src] = true;
        for(int neigh:list.get(src)){
            if(!vis[neigh]){
                dfs(list,neigh,vis);
            }
        }

    }
}
