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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        int res = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int start = q.peek().index;   // first index of level
            int end = start;              // will update later

            for (int i = 0; i < size; i++) {
                Pair curr = q.poll();
                TreeNode node = curr.node;
                int index = curr.index;

                end = index;

                if (node.left != null) {
                    q.offer(new Pair(node.left, 2 * index));
                }

                if (node.right != null) {
                    q.offer(new Pair(node.right, 2 * index + 1));
                }
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }
}

// Helper Pair class
class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}