class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); int c = 0;
        int n = s.length();
        for(int i = n-1; i>=0 ; i--){
            if(s.charAt(i)==' ') break;
            c++;
        }
        return c;
    }
}