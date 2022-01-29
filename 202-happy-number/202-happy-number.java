class Solution {
    public boolean isHappy(int n) {
        String nn = Integer.toString(n);
        int ans = 0; 
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(true){
            for(int i = 0; i<nn.length() ; i++){
                ans += ( (nn.charAt(i)-'0') * (nn.charAt(i)-'0') );
            }
            
            if(ans == 1) return true;
                
                
            if(hm.containsKey(ans)) return false;
            else hm.put(ans,1);
            
            nn = Integer.toString(ans);
            
            ans = 0;
        }
    }
}