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
    public TreeNode constructMaximumBinaryTree(int[] array) {
        if (array.length == 0) return null;

        // Find max and index together
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(max);

        root.left = constructMaximumBinaryTree(
            Arrays.copyOfRange(array, 0, maxIndex)
        );

        root.right = constructMaximumBinaryTree(
            Arrays.copyOfRange(array, maxIndex + 1, array.length)
        );

        return root;
    }
}