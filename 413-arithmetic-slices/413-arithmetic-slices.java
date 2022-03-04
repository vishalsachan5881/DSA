class Solution {
    int sum = 0;
    public int ans(int[] nums, int i){
        
        if(i < 2) return 0;
        int res = 0 ;
        if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
        {
            res = 1+ans(nums,i-1);
            sum+=res;
        }
        else 
         ans(nums,i-1);
        
        return res ;
    }
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int r = ans(nums,n-1);
        return sum;
    }
}