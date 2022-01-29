class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        TreeMap<Integer ,Integer> tm = new TreeMap<>();
        for(int i = 0; i<n ; i++){
            if(tm.containsKey(nums[i])) tm.put(nums[i] , tm.get(nums[i])+1);
            else tm.put(nums[i] , 1);
        }
        
        int ans  = n - tm.get(tm.firstKey()) - tm.get(tm.lastKey());
        if(ans<0) return 0;
        else return ans;
    }
}