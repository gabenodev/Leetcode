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
    
    // DFS implementation 
    // Faster than 100% submissions
    int ans = 1;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return ans-1;
        
    }
    
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        ans = Math.max(left+right+1,ans);
        
        return Math.max(left,right)+1;
    }
    
    
}

    /*
    int diameter = 0;
    
    public int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
            int left = maxHeight(root.left);
            int right = maxHeight(root.right);
            diameter = Math.max((left+right) , diameter);
            return Math.max(left,right)+1;
            
            
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return diameter;
    }
}
*/
    }
}
