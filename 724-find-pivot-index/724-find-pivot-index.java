class Solution {
    public int pivotIndex(int[] nums) {
         int n = nums.length;
        int sum = 0 , leftsum = -1,rightsum=-1,dummysum=0;
        for(int v : nums) sum+= v;
        for(int i = 0; i<n; i++){
            dummysum+=nums[i];
            rightsum=sum-dummysum;
            leftsum = sum - (rightsum+nums[i]);
            if(leftsum==rightsum) return i;
        }
        return -1;
    }
}