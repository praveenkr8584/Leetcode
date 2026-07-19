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
    public boolean isValidBST1(TreeNode root, long l, long h) {
        if (root == null) {
            return true;
        }

        if (root.val <= l || root.val >= h) {
            return false;
        }

        return isValidBST1(root.left, l, root.val) &&
               isValidBST1(root.right, root.val, h);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST1(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}