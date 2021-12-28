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
    public static int dia(TreeNode root,int[] max){
        if(root == null) return 0;
        int lh = dia(root.left,max);
        int rh = dia(root.right,max);
        max[0] = Math.max(max[0],(lh+rh));
        return (1+Math.max(lh,rh));
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] a = new int[1];
         dia(root,a);
        return a[0];
    }
}