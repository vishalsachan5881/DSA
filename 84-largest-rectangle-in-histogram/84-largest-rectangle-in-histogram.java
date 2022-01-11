class Solution {
    public int[]nsrfn(int[] ht, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = n;
        st.push(n-1);
        for(int i=n-2; i>=0 ;i--){
            if(ht[st.peek()] >= ht[i]){
                while(st.size()!=0 && ht[st.peek()] >= ht[i]) st.pop();
            }
            if(st.size()==0) ans[i] = n;
            else ans[i] = st.peek();
            
            st.push(i);
        }
        
        // for(int v : ans)
        //     System.out.print(v + " ");
        
        
        
        
        return ans;
    }
    
     public int[]nslfn(int[] ht, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[0] = -1;
        st.push(0);
        for(int i=1; i<n ;i++){
            if(ht[st.peek()] >= ht[i]){
                while(st.size()!=0 && ht[st.peek()] >= ht[i]) st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            
            st.push(i);
        }
        
        // for(int v : ans)
        //     System.out.print(v + " ");
        
        
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        
        nsr = nsrfn(heights,n);
        nsl = nslfn(heights,n);
        
        int area = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++ ){
            
            int wd = nsr[i] - nsl[i] -1;
            area = Math.max(area , wd * heights[i]);
        }
        
        return area ;
    }
}