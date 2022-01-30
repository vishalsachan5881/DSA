class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minsize = Integer.MAX_VALUE;
        for(var s : strs) minsize = Math.min(minsize,s.length());
        
        //System.out.println(minsize);
        int  flag = 0;
        String ans = "";
        for(int i = 0; i< minsize ; i++){
            char c = strs[0].charAt(i);
            for(int j = 0 ; j<strs.length ; j++){
                if(strs[j].charAt(i)==c) flag = 1;
                else {flag = 0;break;}
            }
            if(flag==0) break;
            if(flag==1) {ans+=c;}
            
        }
        return ans;
    }
}