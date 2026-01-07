class Solution {

    static ArrayList<Long> ls = new ArrayList<>();

    // returns subtree sum
    public static long preor(TreeNode root) {
        if (root == null) return 0;

        long left = preor(root.left);
        long right = preor(root.right);

        long cs = left + right + root.val;
        ls.add(cs);

        return cs;
    }

    public int maxProduct(TreeNode root) {
        ls.clear();

        long totalSum = preor(root);

        long best = 0;
        for (long x : ls) {
            best = Math.max(best, x * (totalSum - x));
        }

        return (int)(best % 1_000_000_007);
    }
}
