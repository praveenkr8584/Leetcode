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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pr=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pr;
            pr=cur;
            cur=temp;
        }
        return pr;
    }
}