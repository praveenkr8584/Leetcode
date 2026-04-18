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
    int total=0;
    public void pre(TreeNode root,TreeNode pr,TreeNode grp){
        if(root==null){
            return;
        }
        if(grp !=null && grp.val%2==0){
            total+=root.val;
        }
        pre(root.left,root,pr);
        pre(root.right,root,pr);
        return;
    }
    public int sumEvenGrandparent(TreeNode root) {
        pre(root,null,null);
        return total;
    }
}