class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        Stack<Integer> s =new Stack<>();
        int[] ans = new int[n];
        
        s.push(n-1);
        ans[n-1] = n-1;
        for(int i = n-2; i>=0;i--){
            while(!s.isEmpty() && t[s.peek()] <= t[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i] = 0;
            else ans[i] = s.peek()-i;
            
            s.push(i);
        }
        
        // for(int i = 0; i<n; i++){
        //     ans[i] = ans[i]-i;
        // }
        ans[n-1] = 0;
        return ans;
        
        
        
        
        
        
        
         
        
        
        
        
        
        
        
        
    }
}