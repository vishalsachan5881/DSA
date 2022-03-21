class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        
        int even = 0 , odd = 0;
        for(var entry : hm.entrySet())
        {
            if(entry.getValue() % 2 == 0) even += entry.getValue();
            else {
                even += entry.getValue()-1;
                odd++;
            }
                
        }
        
        if(odd == 0)
            return even;
        else
            return even+1;
        
    }
}