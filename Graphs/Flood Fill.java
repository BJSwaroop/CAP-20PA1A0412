//https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int m = image.length;
        int n = image[0].length;
        if(color == image[sr][sc]) return image;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    void dfs(int[][] image, int i,int j,int color,int initColor){

        if( ((i==-1 || i==image.length) || (j==-1 || j==image[0].length)) || (image[i][j] != initColor) ) return;
        
        image[i][j] = color;
        dfs(image,i+1,j,color,initColor);
        dfs(image,i-1,j,color,initColor);
        dfs(image,i,j+1,color,initColor);
        dfs(image,i,j-1,color,initColor);
    }
}
