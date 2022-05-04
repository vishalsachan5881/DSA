class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0 , r = n-1,ans = 0;
        while(l<r){
            if(nums[r] + nums[l] == k)
                {l++;r--;ans++;}
            else if(nums[r]+nums[l]>k)
                r--;
                else
                    l++;
        
        }
        return ans;
    }
}