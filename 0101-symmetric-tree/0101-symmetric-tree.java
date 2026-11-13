
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Mirror(root.left , root.right);
    }
    public  boolean Mirror(TreeNode p , TreeNode q){
        if(p == null && q == null){
            return true;
        } 
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return Mirror(p.left ,q.right) && Mirror(p.right , q.left);
    }
}