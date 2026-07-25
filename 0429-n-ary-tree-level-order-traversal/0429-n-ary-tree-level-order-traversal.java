/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                level.add(temp.val);
                List<Node> chil=temp.children;
                for(Node ch:chil){
                    if(ch!=null){
                        q.offer(ch);
                    }
                }
            }
            res.add(level);
        } 
        return res;
    }
}