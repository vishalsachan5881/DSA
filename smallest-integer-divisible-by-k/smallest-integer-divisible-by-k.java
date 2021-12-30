class Solution {
    public int smallestRepunitDivByK(int k) {
        boolean[] arr = new boolean[100000];
        int n = 0, ans = 0;
        if(k%2==0 || k%5==0) return -1;
        while(true){
            ++ans;
            n = ( n *10 + 1 ) % k;
            if(n==0) return ans;
            if(arr[n] == true) return -1;
            arr[n] = true;
        }
        //return -1;
    }
}