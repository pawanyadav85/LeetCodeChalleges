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
    public static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = 0;
        levels(root);
        return max;
    }
    public static int levels(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = levels(root.left);
        int right = levels(root.right);
        int idx = left + right;
        max = Math.max(idx , max);
        return 1 + Math.max(left,right);
    }
}