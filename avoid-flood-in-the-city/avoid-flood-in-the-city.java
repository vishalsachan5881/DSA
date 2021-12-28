class Solution {
    public int[] avoidFlood(int[] rains) {
      int n = rains.length;
      int[] ans = new int[n];
        Arrays.fill(ans,-1);
        HashMap<Integer,Integer> hm = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int i=0; i<n;i++){
            int ele = rains[i];
            
            if(ele == 0) {ts.add(i);ans[i]=1;}
            else{
                if(hm.containsKey(ele)){
                    Integer dry = ts.higher(hm.get(ele));
                    if(dry == null) return new int[0];
                    else{
                        ans[dry]  = ele;
                        ts.remove(dry);
                        hm.put(ele,i);
                    }
                }else hm.put(ele,i);
            }
        }
        return ans;
    }
}