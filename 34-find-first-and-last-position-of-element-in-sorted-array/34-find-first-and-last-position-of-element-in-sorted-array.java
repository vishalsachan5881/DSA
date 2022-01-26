class Solution {
    public static int first(int[] nums , int target , int n,int flag){
        int ans=-1;
        int start = 0 ,  end = n-1 ; 
        while(start <= end) {
            int mid  = start + (end - start)/2 ; 
            if(nums[mid]==target){
                ans = mid;
                if(flag==1) end = mid-1;
                else start = mid+1;
            }
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
            
        }
        return ans ; 
    }
//     public static int last(int[] nums , int target , int n){
//         int ans=-1;
//         int start = 0 ,end = n-1 ; 
//         while(start <= end) {
//             int mid  = start + (end - start)/2 ; 
//             if(nums[mid]==target){
//                 ans = mid;
//                 start = mid+1;
//             }else if(nums[mid] > target) end = mid-1;
//             else start = mid+1;
            
//         }
//         return ans ; 
//     }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = first(nums,target,n,1);
        ans[1] = first(nums,target,n,0);
        return ans ; 
    }
}