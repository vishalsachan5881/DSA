class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ,e = nums.length-1;
        
        while(l<=e){
            int mid = l+(e-l)/2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] > target) e--;
            else l++;
        }
        
        return -1;
    }
}