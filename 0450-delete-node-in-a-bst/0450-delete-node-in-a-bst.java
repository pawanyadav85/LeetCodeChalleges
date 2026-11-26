
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val > key){ // go left
            root.left = deleteNode(root.left,key);
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }else{
            //Case 1 : with zero child
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2 : if on child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            //Case 3 : if two child
            // find predecessor 
            TreeNode pred = root.left;
            while(pred.right != null){
                pred = pred.right;
            }
            root.left = deleteNode(root.left,pred.val);
            pred.left = root.left;
            pred.right = root.right;
            return pred;
        }
        return root;
    }
}