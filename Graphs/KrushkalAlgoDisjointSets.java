//https://www.hackerrank.com/contests/vitgraph1/challenges/kruskalmstrsub     

class Result {

    /*
     * Complete the 'kruskals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts WEIGHTED_INTEGER_GRAPH g as parameter.
     */

    /*
     * For the weighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] and <name>To[i]. The weight of the edge is <name>Weight[i].
     *
     */
    
    static class Pair implements Comparable<Pair>{
        int u;
        int v;
        int wt;
        public Pair(int u,int v, int wt){
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
        public int compareTo(Pair d){
            return this.wt-d.wt;
        }
    }
    public static int find(int u,int[] arr){
        if(arr[u] == u){
            return u;
        }
        return find(arr[u],arr);
    }
    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        int res = 0;
        PriorityQueue<Pair> q = new PriorityQueue<>();
        int[] arr = new int[gNodes];
        for(int i=0;i<gNodes;i++){
            arr[i] = i;
        }
        for(int i=0;i<gFrom.size();i++){
            q.add(new Pair(gFrom.get(i)-1,gTo.get(i)-1,gWeight.get(i)));
        }
        // System.out.println(q.size());
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int u = curr.u;
            int v = curr.v;
            int wt = curr.wt;
            int x = find(u,arr);
            int y = find(v,arr);
            if(x == y){
                continue;
            }
            else{
                arr[y] = x;
                res+=wt;
            }
        // System.out.println(wt);

        }
        return res;
    }

}