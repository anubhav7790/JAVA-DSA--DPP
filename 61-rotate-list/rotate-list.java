class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find size
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        k = k % size;
        if (k == 0) return head; // no rotation

        int target = size - k;

        // Move to target-th node
        ListNode curr = head;
        ListNode prev = null;
        int i = 1;

        while (i <= target) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        // prev is last node of first part
        prev.next = null;

        // curr is new head, find tail
        ListNode tail = curr;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head; // join to old head

        return curr; // new head
    }
}
