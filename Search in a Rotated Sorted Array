// link : https://leetcode.com/problems/search-in-rotated-sorted-array/discussion/

class Solution {
    public int search(int[] nums, int target) {
        return searchutil(nums,target,0,nums.length-1);
    }
    int searchutil(int[] nums, int key, int low,int high){
        int m = low+((high-low)/2);

        if(low>high){
            return -1;
        }
        if(nums[m] == key){
            return m;
        }
        else if(nums[low] <= nums[m]){
           
            if(key < nums[m] && key >= nums[low]){
                return searchutil(nums,key,low,m-1);
            }
            else{
                return searchutil(nums,key,m+1,high);
            }
        }
        else{
            if(key > nums[m] && key <= nums[high]){
                return searchutil(nums,key,m+1,high);
            }
            else{
                return searchutil(nums,key,low,m-1);

            }
        }
      
    }
}
