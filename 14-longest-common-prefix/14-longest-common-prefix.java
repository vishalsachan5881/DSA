class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        //String ans = "";
        int i = 0;
        while(i < strs[0].length()){
            if(strs[strs.length-1].charAt(i) == strs[0].charAt(i))
                i++;
            else break;
        }
        if(i>0) return strs[0].substring(0,i);
        return "";
    }
}