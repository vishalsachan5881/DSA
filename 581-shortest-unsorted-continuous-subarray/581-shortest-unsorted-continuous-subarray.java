class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int startInd = -1, endInd  = -1;
        int start = nums[0];
        for(int i = 1 ; i< nums.length ;i++){
            if(nums[i] < start)
            {
                startInd = i;
            }else
                start = nums[i];
        }
        
        int end = nums[nums.length-1];
        for(int i = nums.length-1 ; i>=0 ;i--){
            if(nums[i] > end)
                endInd  = i;
            else
                end = nums[i];
        }
        
        return (startInd == endInd)? 0 : startInd - endInd +1;
    }
}