class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        // if(n==1 && nums[0] != 0)
        //     return ;
        int p = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int t = nums[p];
                nums[p] = nums[i];
                nums[i] = t;
                p++;
            }
        }
    }
}