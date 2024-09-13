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
    public boolean isSymmetric(TreeNode root) {
       return (root==null||f(root.right,root.left));
        
    }
    public boolean f(TreeNode right,TreeNode left){
        if(right==null || left==null)return left==right;
        if(right.val!=left.val)return false;
        return f(right.right,left.left) && f(right.left,left.right);
    }
}