class Solution {
    Boolean dp[][];
    public boolean fn(int[] nums, int index , int sum,int key){
         if(sum == key) return true;
        if(index == nums.length || sum > key) return false;
        if(dp[index][sum] != null) return dp[index][sum];
        return dp[index][sum] = fn(nums, index+1, sum+nums[index],key) || fn(nums,index+1,sum,key);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
       
        for(int v : nums) sum+= v;
        if((sum&1) != 0) return false;
                 dp = new Boolean[nums.length+1][sum + 1];

        return fn(nums,0,0,sum/2);
        
        
    }
}