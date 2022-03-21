class Solution {
    HashMap<String , Boolean> map = new HashMap<>();
    
    public boolean fn(String s, List<String> wordDict){
        if(s.length() == 0) return true;
        
        if(map.containsKey(s)) return map.get(s);
        
        for(int i =0 ;i<s.length(); i++){
            String left = s.substring(0,i+1);
            if(wordDict.contains(left) && fn(s.substring(i+1),wordDict)){
                map.put(s.substring(i+1),true);
                return true;
            }
            
        }
        map.put(s,false);
        return false;
        // map.put(s,false);
        
         
    }
    public boolean wordBreak(String s, List<String> wordDict) {
         return fn(s,wordDict);
    }
}