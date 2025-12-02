import java.util.Random;

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
    private int[] arr;   // store values
    private Random rand; // random generator

    public Solution(ListNode head) {
        // Count nodes
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Fill array
        arr = new int[count];
        curr = head;
        for (int i = 0; i < count; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }

        rand = new Random();
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(arr.length); // uniform random index
        return arr[randomIndex]; // return value at that index
    }
}