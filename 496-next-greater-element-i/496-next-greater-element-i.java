class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer,Integer> hm  = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        //int[] ans = new int[n];
        //ans[n-1] = -1;
        st.push(nums2[n-1]);
        hm.put(nums2[n-1] , -1);
        
        for(int i = n-2; i>=0 ;i --){
            while( st.size()>0 && st.peek() <= nums2[i] ){
                st.pop();
            }
            
            if(st.size()==0) hm.put(nums2[i] , -1);
            else  hm.put(nums2[i],st.peek());
            
            
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = hm.get(nums1[i]);
        }
        
        return ans;
    }
}