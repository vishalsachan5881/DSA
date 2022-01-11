class Solution {
    public String addBinary(String a, String b) {
        int na = a.length();
        int nb = b.length();
        String ans = "";
        if(a.length() > b.length())
            b = "0".repeat(na-nb) + b;
        else a = "0".repeat(nb-na) + a;
        
        char carry = '0';
        for(int i=a.length()-1; i>=0; i--){
            if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(carry == '0'){
                    carry = '0';
                    ans = '0'+ans;
                }else{
                    carry = '0';
                    ans = '1' + ans;
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carry == '0'){
                    carry = '1';
                    ans = '0'+ans;
                }else{
                    carry = '1';
                    ans = '1' + ans;
                }
            }
            else if(a.charAt(i) != b.charAt(i) ){
                if(carry == '0'){
                    carry = '0';
                    ans = '1'+ans;
                }else{
                    carry = '1';
                    ans = '0' + ans;
                }
            }
        }
        if(carry == '1') ans = carry+ans;
        
        
        return ans;
    }
}