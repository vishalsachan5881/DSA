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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        int result = 0 ;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i < n ; i++){
                
                TreeNode node = q.poll();
                if(i==0)
                    result = node.val;
                
                if(node.right != null) q.add(node.right);
                if(node.left != null) q.add(node.left);
                
            }
            ans.add(result);
        }
        return ans;
    }
}