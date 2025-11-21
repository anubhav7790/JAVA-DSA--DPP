class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;      // <-- FIRST check

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next;      // skip duplicate
                curr = curr.next;
            } else {
                prev = curr;                // move forward
                curr = curr.next;
            }
        }

        return head;
    }
}
