class Solution {
    public int minimumSum(int n) {
        int[] arr = new int[4];
    int i = 0;
    int sum = 0;
        while(n!=0) {
            arr[i] = n%10;
            i++;
            // sum+= (n%10);
            n=n/10;
        }
    Arrays.sort(arr);
    return arr[0]*10+arr[3] + arr[1]*10+arr[2];
    }
}