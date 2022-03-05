class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        int[] include = new int[10001];
        int[] exclude = new int[10001];
        for(int i = 0 ; i<nums.length; i++){
            sum[nums[i]] += nums[i];
        }
        include[0] = sum[0];
        exclude[0] = 0;
        int max = -1;
        for(int i = 1 ; i<10001; i++){
            exclude[i] = Math.max(include[i-1],exclude[i-1]);
            include[i] = exclude[i-1]+sum[i];
            max = Math.max(exclude[i],include[i]);
        }
        
        return max;
    }
}