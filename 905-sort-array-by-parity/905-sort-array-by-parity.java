class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int evenInd = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if((arr[i]&1)==0) // even
            {
                int t = arr[evenInd];
                arr[evenInd]  = arr[i];
                arr[i] = t;
                
                evenInd++;
            }
        }
        return arr;
    }
}