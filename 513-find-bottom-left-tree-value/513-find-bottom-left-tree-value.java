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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>(); 
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0 ; i< s ; i++){
                TreeNode node = q.remove();
                arr.add(node.val);
                
                if(node.left != null) q.add(node.left);
                
                if(node.right != null) q.add(node.right);
                
                
            }
            ans.add(arr);
        }
        return ans.get(ans.size()-1).get(0);
    }
}