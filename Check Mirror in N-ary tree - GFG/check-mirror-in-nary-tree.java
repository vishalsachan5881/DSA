// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[2*e];
            int[] B = new int[2*e];
            
            for(int i=0; i<2*e; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkMirrorTree(n,e,A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
       
       HashMap<Integer,Stack<Integer>> map = new HashMap<Integer,Stack<Integer>> ();
       for(int i=0; i<2*e; i+=2){
         if(!map.containsKey(A[i])){
             Stack<Integer> stack = new Stack<Integer>();
             stack.push(A[i+1]);
             map.put(A[i],stack);
         }
         else 
           map.get(A[i]).push(A[i+1]);
       }
   
       for(int i=0; i<2*e; i+=2){
        if(map.containsKey(B[i]) && map.get(B[i]).size() >0 ) {  
          if(B[i+1] != map.get(B[i]).peek()){
            return 0;
          }
            map.get(B[i]).pop();     
         }     
       }
       return 1;
   }
};