class Solution {
    String[] map = {".","..",
                 "abc",
                 "def",
                 "ghi",
                 "jkl",
                 "mno",
                 "pqrs",
                 "tuv",
                 "wxyz"
                  };
  public List<String> letterCombinationss(String digits) {
      
      if(digits.length() == 0){
            List<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char front = digits.charAt(0);
        String rest = digits.substring(1);
        List<String> rest_ans = letterCombinationss(rest);
        
        // if(rest_ans.get(0).length() == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        
        String f = map[front - '0'];
        for(int i = 0 ; i<f.length(); i++){
            for(var v : rest_ans){
                ans.add(f.charAt(i) + v);
            }
        }
        
        return ans;
  }
    
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0) return new ArrayList<>();

            List<String> ans = new ArrayList<>();
        ans = letterCombinationss(digits);
        
        // if(ans.get(0).length() == 0)
            
         return ans;

        
    }
}