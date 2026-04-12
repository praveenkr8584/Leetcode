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
    List<Integer> ls1=new ArrayList<>();
    List<Integer> ls2=new ArrayList<>();
    public void order(TreeNode root){
        if(root==null){
            ls1.add(null);
            return;
        }
        ls1.add(root.val);
        order(root.left);
        order(root.right);
        return;
    }
    public void rev(TreeNode root){
        if(root==null){
            ls2.add(null);
            return;
        }
        ls2.add(root.val);
        rev(root.right);
        rev(root.left);
        return;
    }
    
    public boolean isSymmetric(TreeNode root) {
        order(root.left);
        rev(root.right);
        if(ls1.equals(ls2)){
            return true;
        }else{
            return false;
        }
    }
}