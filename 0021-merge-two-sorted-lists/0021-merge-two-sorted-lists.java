class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            ListNode temp = list1.next;     // store next
            list1.next = mergeTwoLists(temp, list2); // FIX: don't attach list2 directly
            return list1;                  // FIX: return correct head
        } else {
            ListNode temp = list2.next;
            list2.next = mergeTwoLists(list1, temp); // FIX here also
            return list2;
        }
    }
}