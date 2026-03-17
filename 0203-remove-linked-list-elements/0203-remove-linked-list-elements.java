/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode root, int val) {
        if(root==null) return null;
        if(root.val!= val){
            root.next=removeElements(root.next,val);
        }else{
            return removeElements(root.next,val);
        }
        return root;
    }
}