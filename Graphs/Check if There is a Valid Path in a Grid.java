//https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/description/
class Solution {
    boolean ch = false;
    public boolean hasValidPath(int[][] grid) {

        HashMap<Integer, HashMap <Integer,HashSet<Integer>>> map = new HashMap<>();
        HashMap<Integer,HashSet<Integer>> map1=new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        set.add(3);set.add(5);set.add(1);
        map1.put(1,set);set= new HashSet<>();
        set.add(4);set.add(6);set.add(1);
        map1.put(3,set);map.put(1,map1);
        map1 = new HashMap<>();set= new HashSet<>();

        set.add(3);set.add(4);set.add(2);
        map1.put(0,set);set= new HashSet<>();
        set.add(5);set.add(6);set.add(2);
        map1.put(2,set);map.put(2,map1);
        map1 = new HashMap<>();set= new HashSet<>();
        
        set.add(2);set.add(5);set.add(6);
        map1.put(2,set);set= new HashSet<>();
        set.add(1);set.add(4);set.add(6);
        map1.put(3,set);map.put(3,map1);
        map1 = new HashMap<>();set= new HashSet<>();

        set.add(5);set.add(3);set.add(1);
        map1.put(1,set);set= new HashSet<>();
        set.add(2);set.add(5);set.add(6);
        map1.put(2,set);map.put(4,map1);
        map1 = new HashMap<>();set= new HashSet<>();

        set.add(2);set.add(3);set.add(4);
        map1.put(0,set);set= new HashSet<>();
        set.add(1);set.add(4);set.add(6);
        map1.put(3,set);map.put(5,map1);
        map1 = new HashMap<>();set= new HashSet<>();

        set.add(1);set.add(5);set.add(3);
        map1.put(1,set);set= new HashSet<>();
        set.add(2);set.add(4);set.add(3);
        map1.put(0,set);map.put(6,map1);
        map1 = new HashMap<>();set= new HashSet<>();
        
        dfs(grid,map,0,0);
        System.out.println(grid);
        return ch;
    }
    public void dfs(int[][] grid,HashMap<Integer, HashMap <Integer,HashSet<Integer>>> map,int i, int j){
        if(i == grid.length-1 && j == grid[0].length-1){
            ch = true;
        }
        int temp = grid[i][j];
        grid[i][j] = -1;
        int[] x = {i-1,i, i+1, i};
        int[] y = {j, j+1, j, j-1};
        for(int k=0; k<4; k++){
            if(x[k] != -1 && x[k] != grid.length && y[k] != -1 && y[k] != grid[0].length ){
                if(temp != -1){
                    if(map.get(temp).containsKey(k)){
                        if(map.get(temp).get(k).contains(grid[x[k]][y[k]])) {
                            dfs(grid,map,x[k], y[k]);
                        }
                    }
                }    

            }

        }
    }
}
