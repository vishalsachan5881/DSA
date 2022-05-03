class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] != nums[p])
                {
                p++;
                int t= nums[p];
                nums[p] = nums[i];
                nums[i] = t;
                }
            
            
        }
        return p+1;
    }
}