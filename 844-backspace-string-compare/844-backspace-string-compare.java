class Solution {
    public String fn(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != '#')
                st.push(s.charAt(i));
            else if(!st.isEmpty())
                st.pop();
        }
        return String.valueOf(st);
    }
    public boolean backspaceCompare(String s, String t) {
        if(s.equals(t))
            return true;
         return fn(s).equals(fn(t));
    }
}