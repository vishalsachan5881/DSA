class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        System.out.println(hm);
        int ans = 0;
        for(var v : hm.keySet()){
            if(hm.containsKey(k-v)) {

                if(k-v == v) {
                    ans += hm.get(v)/2;
                    hm.put(v, hm.get(v) % 2);

                }
                else
                {
                    int p = Math.min(hm.get(v), hm.get(k - v));
                    hm.put(v, hm.get(v) - p);
                    hm.put(k - v, hm.get(k - v) - p);

                    ans += p;
                }
            }

        }
        // System.out.println(ans);
        return ans;
    }
}