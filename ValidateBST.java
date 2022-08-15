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
    public boolean isValidBST(TreeNode root) {
        return isBST(Long.MIN_VALUE,Long.MAX_VALUE,root);
    }
    
    static boolean isBST(long min,long max,TreeNode root){
        if(root==null)
		return true;
        return root.val>min &&
		root.val<max && 
		isBST(min,root.val,root.left)&&
		isBST(root.val,max,root.right); // checking all the conditions
    }
}
