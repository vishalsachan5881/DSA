class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            if(st.isEmpty())
                st.push(s.charAt(i));
             else{ 
                 char ch = st.peek();
                 if(ch == s.charAt(i))
                     st.pop();
                 else
                     st.push(s.charAt(i));
             }   
        }
        
         StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
            ans.append(st.pop());
        
        return ans.reverse().toString();
    }
}