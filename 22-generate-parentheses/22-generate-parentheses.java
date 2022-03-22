class Solution {
    public void fn(int open, int close, String ansf , List<String> ans){
        if(open == 0 && close ==0){
            ans.add(ansf);
            return;
        }
        
        if(open != 0)
            fn(open-1,close,ansf+'(',ans);
        
        if(close !=0 && open < close)
            fn(open, close-1, ansf+')' ,ans);
    }

            
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fn(n,n,"",ans);
        return ans;
    }

    }
