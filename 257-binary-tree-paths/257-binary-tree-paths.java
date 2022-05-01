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
    public boolean fn(TreeNode node, List<String> ans, String ansf){
        if(node == null)
            return true;
        ansf+=(node.val+"->");
        boolean r1 = fn(node.left, ans , ansf);
        boolean r2 = fn(node.right, ans , ansf);
        if(r1 && r2)
        {
            ans.add(ansf.substring(0,ansf.length()-2));
            ansf = ansf.substring(0,ansf.length()-3);
        }
        return false;
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        fn(root,ans,"");
        return ans;
    }
}