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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int n = q.size();
            for(int i=0; i<n ;i++){
                TreeNode node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                ls.add(node.val);
            }
            ans.add(0,ls);
        }
        // int nn = ans.size();
        // for(int  i = 0; i<ans.size()/2 ; i++){
        //     List<Integer> temp = ans.get(i);
        //     ans.set(i,ans.get(nn-1-i));
        //     ans.set(nn-1-i, temp);
        // }
        
        return ans;
    }
}