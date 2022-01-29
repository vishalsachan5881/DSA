class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0, ct = 0;
        for(int i =0; i<n ;i++){
            if(ct == 0) ele = nums[i];
            if(ele == nums[i]) ct++;
            else ct--;
        }
        
        return ele;
    }
}