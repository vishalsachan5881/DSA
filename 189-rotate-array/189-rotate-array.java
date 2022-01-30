class Solution {
    public static void reverse(int[] nums , int start , int end){
        while(start < end) {
            swap(nums, start , end);
            start++;
            end -- ;
        }
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void rotate(int[] nums, int k) {
          k  = k % nums.length;
        int n= nums.length;
        reverse(nums , n -  k , n - 1);
        reverse(nums, 0 , n-k-1);
        reverse(nums, 0 , n-1);
    }
}