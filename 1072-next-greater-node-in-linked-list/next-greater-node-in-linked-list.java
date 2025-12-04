class Solution {
    public int[] nextLargerNodes(ListNode head) {

        if (head == null) return new int[0];

        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            n++;
        }

        int[] answer = new int[n];

        ListNode curr1 = head;
        ListNode curr2;
        int max = 0, i = 0;

        while (curr1 != null) {
            curr2 = curr1.next;
            max = 0;

            while (curr2 != null) {
                if (curr1.val < curr2.val) {
                    if (max < curr2.val) max = curr2.val;
                    break ; 
                }
                curr2 = curr2.next;
            }

            answer[i] = max;
            curr1 = curr1.next;
            i++;
        }

        return answer;
    }
}
