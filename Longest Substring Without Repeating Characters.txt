// link: https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int mini = 0;
        while(j<s.length() && i<=j){
            if(map.containsKey(s.charAt(j))){
                mini = Math.max(map.size(),mini);
                while(s.charAt(i) != s.charAt(j)){
                    map.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
            else{
                map.put(s.charAt(j),1);
                j++;
            }
        }
        return Math.max(mini,map.size());
    }
}
