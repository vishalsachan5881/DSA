/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int fn(TreeNode root, int[] m){
        if(root == null) return 0;
        int lh = Math.max(0,fn(root.left, m)) ;
        int rt =  Math.max(0,fn(root.right, m));
        m[0]  = Math.max(m[0] , lh+rt+root.val);
        
        return root.val + Math.max(lh,rt);
    }
    public int maxPathSum(TreeNode root) { 
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        fn(root,maxi);
        return maxi[0];
        
    }
}