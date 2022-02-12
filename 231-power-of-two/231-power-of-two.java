class Solution {
    public boolean isPowerOfTwo(int n) {
        int p = n;
        int count=0;
        while(n!=0){
            n=(n&n-1);
            count++;
        }
        // System.out.println(count);
        return count==1 && p>0;
    }
}