

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* add(struct ListNode* root, int value) {
    struct ListNode* new = (struct ListNode*)malloc(sizeof(struct ListNode));
    new->val = value;
    new->next = NULL;
    if (root == NULL) {
        return new;
    }
    struct ListNode* temp = root;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = new;

    return root;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* result = NULL;
    struct ListNode *p = l1, *q = l2;
    int carry = 0;

    while (p != NULL || q != NULL || carry > 0) {
        int x = (p != NULL) ? p->val : 0;
        int y = (q != NULL) ? q->val : 0;

        int sum = x + y + carry;
        carry = sum / 10;

        result = add(result, sum % 10);

        if (p != NULL)
            p = p->next;
        if (q != NULL)
            q = q->next;
    }

    return result;
}