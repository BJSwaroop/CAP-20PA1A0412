//https://leetcode.com/problems/course-schedule-ii/
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int i=0;i<inDegree.length;i++){
            inDegree[i] = 0;
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
            inDegree[prerequisites[i][1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<numCourses;i++){
            System.out.println(inDegree[i]);
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int[] res = new int[numCourses];
        int i=numCourses-1;
        while(!q.isEmpty()){
            int curr = q.poll();
            if(inDegree[curr] == 0){
                res[i] = curr;
                i--;
            }
           
            for(int neigh:adj.get(curr)){
                if(--inDegree[neigh] == 0){
                    q.add(neigh);
                }
            }

        }
        for(int j=0;j<numCourses;j++){
            System.out.println("i " + i);
        }
        if(i<0){

        return res;
        }
        return new int[]{};
    }
   
}
