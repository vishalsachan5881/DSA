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
     // int m = -1;
    public static int dia(TreeNode root,int[] m){
        if(root == null) return 0;
        
        int l = dia(root.left,m);
        int r = dia(root.right,m);
        m[0] = Math.max(m[0], l+r);
        
        return 1+Math.max(l,r);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] m = new int[1];
        int a = dia(root,m);
        return m[0];
    }
}