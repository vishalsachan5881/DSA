class Solution {
    class pair{
        int c;
        char str;
        pair(int c,char str)
        {
            this.c=c;
            this.str=str;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.size()!=0)
            {
                if(st.peek().str==ch)
                {
                    st.push(new pair(st.peek().c+1,ch));
                }
                else
                {
                    st.push(new pair(1,ch));
                }
 
 //if same type of pair is equal to k then remove that k pairs
                if(st.peek().c==k)
                {
                    for(int j=0;j<k;j++)
                    {
                        st.pop();
                    }
                }
            }
            else
            {
                st.push(new pair(1,ch));
            }
        }
        StringBuilder ans=new StringBuilder("");
        while(st.size()!=0)
        {
            ans.append(st.pop().str);
        }
        return ans.reverse().toString();
    }
    
}