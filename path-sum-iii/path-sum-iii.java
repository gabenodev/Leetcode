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
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return 0;
        }
        
        return findPaths(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }

        
        
        public int findPaths(TreeNode root, int targetSum){
            
           int count = 0;
            
            if(root == null){
                return count;
            }
            
            if(targetSum == root.val){
                count++;
            }
        
            
            count += findPaths(root.left, targetSum - root.val) + findPaths(root.right, targetSum - root.val);
            return count;
       
        }
}
