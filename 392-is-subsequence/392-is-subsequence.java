class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int n1 = t.length();
        int p=0,q=0;
        while(p<n && q<n1){
            if(s.charAt(p) == t.charAt(q))
            {
                p++;
                q++;
            }else q++;
        }
        if(p==n) return true;
        return false;
    }
}