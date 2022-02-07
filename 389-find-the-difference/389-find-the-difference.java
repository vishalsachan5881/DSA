class Solution {
    public char findTheDifference(String s, String t) {
       char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for(var v  : ss)
            System.out.print(v+"");
        System.out.println();
        
        for(var v  : tt)
            System.out.print(v+"");
        for(int i = 0 ;i <s.length(); i++){
            if(ss[i]!=tt[i]) return tt[i];
        }
        return tt[t.length()-1];
        
    }
}