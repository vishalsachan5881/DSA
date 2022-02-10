class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0,check=0,ans=0;
        hm.put(0,1);
        for(int v : nums){
            sum+=v;
            check = sum-k;
            if(hm.containsKey(check))
                ans+=hm.get(check);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}