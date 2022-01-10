// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        m = m-1;
        Collections.sort(a);
        long ans = Integer.MAX_VALUE;
        //long start  = 0l, end = (m-1)l;
        long start  = 0L;
        long end = m;
        while(end<n){
            if( a.get((int)end) - a.get((int)start) < ans )
            ans = a.get((int)end) - a.get((int)start);
            start++;
            end++;
        }
        
        return ans;
        // your code here
    }
}