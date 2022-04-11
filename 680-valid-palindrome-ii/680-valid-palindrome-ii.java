class Solution {
    public boolean check(int l , int r, String s){
        while(l<=r)
        {
            if(s.charAt(l) == s.charAt(r)) {
                l++;r--;
            }else return false;
        }
        
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;r--;
            }
            else{
                return (check(l+1,r,s) || check(l,r-1,s));
            }
        }
        
        return true;
    }
    
}