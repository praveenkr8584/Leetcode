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
    public ListNode rotateRight(ListNode head, int k) {
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        if(l==0 || l==1)return head;
        k%=l;
        if(k==0)return head;
        k=l-k;
        temp=head;
        ListNode temp2=null;
        int pos=1;
        while(pos!=k){
            temp=temp.next;
            pos++;
        }
        temp2=temp.next;
        temp.next=null;
        ListNode newhead=temp2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        return newhead;
    }
}