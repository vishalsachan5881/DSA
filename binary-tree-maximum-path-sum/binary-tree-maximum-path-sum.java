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
    public static int sum(TreeNode root, int[] ans){
        if(root == null) return  0;
        int lsum = Math.max(0,sum(root.left, ans));
        int rsum = Math.max(0,sum(root.right,ans));
        ans[0] = Math.max(ans[0], root.val+lsum+rsum);
        return (root.val+ Math.max(lsum,rsum));
    }
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
        sum(root,ans);
        return ans[0];
        
    }
}