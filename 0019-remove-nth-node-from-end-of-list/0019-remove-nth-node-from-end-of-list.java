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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        for(int i=0;i<n-1;i++){
            f=f.next;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        if(s==head){
            head=head.next;
            return head;
        }
        ListNode p=head;
        while(p.next!=s){
            p=p.next;
        } 
        p.next=s.next;
        return head;

    }
}