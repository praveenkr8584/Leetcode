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
    List<List<Integer>> ls=new ArrayList<>();
    public void traversal(TreeNode root,int row,int col){
        if(root==null)return;
        ls.add(new ArrayList<>(Arrays.asList(col, row, root.val)));   
        traversal(root.left,row+1,col-1);
        traversal(root.right,row+1,col+1);
        return;
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traversal(root,0,0);
        Collections.sort(ls, (a, b) -> {
            if (!a.get(0).equals(b.get(0)))
                return a.get(0) - b.get(0);   // col
            if (!a.get(1).equals(b.get(1)))
                return a.get(1) - b.get(1);   // row
            return a.get(2) - b.get(2);   // value
        });
        List<List<Integer>> res=new ArrayList<>();
        int ind= ls.get(0).get(0);
        res.add(new ArrayList<>(Arrays.asList(ls.get(0).get(2))));
        int k=0; 
        for(int i=1;i<ls.size();i++){
            if(ind!=ls.get(i).get(0)){
                res.add(new ArrayList<>());
                k++;
                ind=ls.get(i).get(0);
            }
            res.get(k).add(ls.get(i).get(2));
        }  
        return res;
    }
}