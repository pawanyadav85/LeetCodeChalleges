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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0 , n - 1 , 0 , n - 1, inorder, postorder);
    }
    public TreeNode build(int pLo , int pHi , int inLo , int inHi, int[] inorder, int[] postorder) {
        if(pLo > pHi){
            return null;
        }
        int val = postorder[pHi];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i = inLo ; i <= inHi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int count = r - inLo;
        root.left = build(pLo , pLo + count - 1 , inLo , r - 1, inorder, postorder);
        root.right = build(pLo + count, pHi - 1 , r + 1 , inHi, inorder, postorder);
        return root;
    }
}