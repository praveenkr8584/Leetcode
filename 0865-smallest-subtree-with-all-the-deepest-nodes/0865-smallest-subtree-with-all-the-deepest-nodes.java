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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
    public result dfs(TreeNode node ){
        if(node==null)return new result(null,0);
        result l=dfs(node.left);
        result r=dfs(node.right);
        if(l.dist>r.dist)return new result(l.node,l.dist+1);
        if(l.dist<r.dist)return new result(r.node,r.dist+1);
        return new result(node,l.dist+1);

    }
    class result{
        TreeNode node;
        int dist;
        result(TreeNode n,int d){
            node=n;
            dist=d;
        }
    }
}