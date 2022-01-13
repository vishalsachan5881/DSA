class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int s =0 , end = n-1;
        while(s<=end){
           int mid = s+(end-s)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else s = mid+1;
        }
        return s ;
        
        //return  0 ;
    }
}