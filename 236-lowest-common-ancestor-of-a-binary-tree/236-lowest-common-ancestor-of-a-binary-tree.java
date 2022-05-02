/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode fn(TreeNode node, TreeNode p , TreeNode q){
        
        if(node == null || node.val == p.val || node.val == q.val)
            return node;
//         if(node.left == null || node.right == null)
//             return null;
        
        TreeNode n1 = fn(node.left , p , q);
        TreeNode n2 = fn(node.right , p , q);
        
        if(n1==null)return n2;
        else if(n2 == null ) return n1;
        else
            return node;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val == p.val || root.val == q.val)
            return root;
        
        return fn(root, p, q);
        
    }
}