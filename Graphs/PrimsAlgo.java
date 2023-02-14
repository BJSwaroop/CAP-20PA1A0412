// https://www.hackerrank.com/contests/vitgraph1/challenges/primsmstsub
class Result {

    /*
     * Complete the 'prims' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY edges
     *  3. INTEGER start
     */
    static class Pair implements Comparable<Pair>{
        int v;
        int wt;
        public Pair(int v,int wt){

            this.v = v;
            this.wt = wt;
     
        }
        public int compareTo( Pair d ){
            return this.wt-d.wt;
        }
    }
    public static int prims(int n, List<List<Integer>> edges, int start) {
    // Write your code here
        PriorityQueue<Pair> q = new PriorityQueue<>();
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());    
        }
        for(int i=0;i<edges.size();i++){
                int u = edges.get(i).get(0);
                int v = edges.get(i).get(1);
                int wt = edges.get(i).get(2);

                adj.get(u-1).add(new Pair(v-1,wt));
                adj.get(v-1).add(new Pair(u-1,wt));
        }
        q.add(new Pair(start-1,0));
        int res = 0;
        boolean[] vis = new boolean[n];
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
            int currV = curr.v;
            int currWt = curr.wt;
            if(vis[currV]) continue;
            res+= currWt;
            vis[currV] = true;
            for(Pair neigh:adj.get(currV)){
                int neighV = neigh.v;
                int neighWt = neigh.wt;
                if(!vis[neighV]){
                    q.add(neigh);
                    
                }
            }            
        }
        return res;
        
    }

}