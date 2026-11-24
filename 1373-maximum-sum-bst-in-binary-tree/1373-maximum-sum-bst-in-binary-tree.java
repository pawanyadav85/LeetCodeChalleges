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
class quad {
    int max;
    int min;
    int size;
    int sum;

    quad(int max, int min, int size, int sum) {
        this.max = max;
        this.min = min;
        this.size = size;
        this.sum = sum;
    }
}

class Solution {
    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }

    public quad helper(TreeNode root){
        if(root == null){
            return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        }
        quad lst = helper(root.left);
        quad rst = helper(root.right);
        if(root.val > lst.max && root.val < rst.min){
            int size = 1 + lst.size + rst.size;
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min,rst.min));
        int  sum = root.val + lst.sum + rst.sum;
         maxSum = Math.max(maxSum,sum);
        return new quad(max,min,size,sum);
        }
        return new quad(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Math.max(lst.sum, rst.sum));
    }
}