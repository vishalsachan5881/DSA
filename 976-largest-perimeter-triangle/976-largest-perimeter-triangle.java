class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int p = n-3;
        while(p>=0){
            if(nums[p]+nums[p+1] > nums[p+2])
                return nums[p]+nums[p+1]+nums[p+2];
            p--;
        }
        return 0;
    }
}