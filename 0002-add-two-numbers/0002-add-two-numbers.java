class Solution {
    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Base case
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                return new ListNode(carry);
            }
            return null;
        }

        // Handle null nodes
        if (l1 == null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            l2.val = sum % 10;
            l2.next = addTwoNumbers(null, l2.next);
            return l2;
        }

        if (l2 == null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            l1.val = sum % 10;
            l1.next = addTwoNumbers(l1.next, null);
            return l1;
        }

        // Normal case
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        l1.val = sum % 10;
        l1.next = addTwoNumbers(l1.next, l2.next);

        return l1;
    }
}