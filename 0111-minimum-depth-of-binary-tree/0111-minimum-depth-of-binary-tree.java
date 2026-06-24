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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Only right child exists — must go right
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // Only left child exists — must go left
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // Both children exist — take the minimum
        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));
    }
}