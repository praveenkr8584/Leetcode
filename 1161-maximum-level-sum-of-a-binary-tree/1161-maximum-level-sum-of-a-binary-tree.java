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
    public int maxLevelSum(TreeNode root) {
        int maxm=Integer.MIN_VALUE;
        int level=1;
        int clevel=1;
        Queue<TreeNode> st=new LinkedList<>();
        st.offer(root);
        while(!st.isEmpty()){
            int s=st.size();
            int levelsum=0;
            for(int i=0;i<s;i++){
                TreeNode curr=st.poll();
                levelsum+=curr.val;
                if (curr.left != null) {
                    st.offer(curr.left);
                }
                if (curr.right != null) {
                    st.offer(curr.right);
                }
            }
            if(maxm<levelsum){
                maxm=levelsum;
                clevel=level;
            }
            level++;
        }
        return clevel;
    }
}