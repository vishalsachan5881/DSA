class Solution {
    public void sortColors(int[] nums) {
        int low = 0 , mid = 0 , high = nums.length -1 ;
        while( mid <= high){
            if(nums[mid] == 0)
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int t = nums[mid];
                nums[mid] = nums[high];
                nums[high] = t;
                high -- ;
            }
        }
    }
}