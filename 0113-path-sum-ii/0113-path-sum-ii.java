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
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public void pre(TreeNode root,int cursum,int targetsum){
        if(root==null){
            return;
        }
        cursum+=root.val;
        path.add(root.val);
        //checking that leaf node or not
        if(root.left==null && root.right==null && cursum==targetsum){
            res.add(new ArrayList<>(path));
        }
        pre(root.left,cursum,targetsum);
        pre(root.right,cursum,targetsum);
        path.remove(path.size()-1); //backtrack
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
        pre(root,0,targetsum);
        return res;
    }
}