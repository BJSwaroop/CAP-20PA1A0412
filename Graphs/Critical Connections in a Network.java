//https://leetcode.com/problems/critical-connections-in-a-network/description/

class Solution {
    int time = 0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.size();i++){
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis = new boolean[n];
        int[] lowTime = new int[n];     
        int[] disTime = new int[n];     
        for(int i=0;i<n;i++){
            if(!vis[i]){
                
                dfs(adj,i,-1,vis,disTime,lowTime,list);
            }
        }
        return list;
    }
    void dfs(List<List<Integer>> adj,int u,int par,boolean[] vis,int[] disTime,int[] lowTime,List<List<Integer>> list)
    {
        disTime[u] = lowTime[u] = time;
        time++;
        vis[u] = true;
        for(int v:adj.get(u)){

            if(v== par){continue;}
            else{
                if(!vis[v]){
                    dfs(adj,v,u,vis,disTime,lowTime,list);
                    lowTime[u] = Math.min(lowTime[v],lowTime[u]);
                    if(lowTime[v] > disTime[u]){
                        List<Integer> l= new ArrayList<>();
                        l.add(u);
                        l.add(v);
                        list.add(l);
                    }
                }else{
                    lowTime[u] = Math.min(lowTime[v],lowTime[u]);
                }
            }

        }



    }

}
