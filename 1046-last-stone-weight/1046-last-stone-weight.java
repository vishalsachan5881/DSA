class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(var v : stones)
            pq.add(v);
        
        while(pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            
            if(s1 != s2)
                pq.add(s1-s2);
            

        }
        
        if(pq.size() == 1)
            return pq.poll();
        else 
            return 0;
    }
}