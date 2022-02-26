class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        int p1 = 0 , p2 = n-1;
        for(int i = 0; i<n ; i++) {
            if((nums[i] & 1) == 0){
                ans[p1] = nums[i];
                p1++;
            }else{
                ans[p2] = nums[i];
                p2--;
            }
        }
        return ans;
    }
}