class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean one = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) one = true;
            if(nums[i] <= 0) nums[i] = 1;
        }
        if(one == false) return 1;
        for(int i = 0 ; i<n ;i++){
            if(nums[i] > n) continue;
            else{
                int indexToChange = Math.abs(nums[i]) - 1;
                if(nums[indexToChange]>0)nums[indexToChange] *= -1;
            }
        }
        for(int i = 0 ; i<n; i++)
        {
           if(nums[i] > 0) return i+1;
        }
        
        return n+1;
    }
}