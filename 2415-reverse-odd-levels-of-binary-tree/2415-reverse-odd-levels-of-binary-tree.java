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
    public void pre(TreeNode l,TreeNode r,int level){
        if(l==null && r==null){
            return;
        }
        if(level%2==1){
            int temp=r.val;
            r.val=l.val;
            l.val=temp;
        }
        pre(l.left,r.right,level+1);
        pre(l.right,r.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        pre(root.left,root.right,1);
        return root;
        
    }
}