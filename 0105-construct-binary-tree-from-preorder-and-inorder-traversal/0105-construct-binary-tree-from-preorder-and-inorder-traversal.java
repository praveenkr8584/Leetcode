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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;

        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        // find root index in inorder manually
        int mid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                mid = i;
                break;
            }
        }

        // left subtree
        root.left = buildTree(
            Arrays.copyOfRange(preorder, 1, 1 + mid),
            Arrays.copyOfRange(inorder, 0, mid)
        );

        // right subtree
        root.right = buildTree(
            Arrays.copyOfRange(preorder, 1 + mid, preorder.length),
            Arrays.copyOfRange(inorder, mid + 1, inorder.length)
        );

        return root;
    }
}