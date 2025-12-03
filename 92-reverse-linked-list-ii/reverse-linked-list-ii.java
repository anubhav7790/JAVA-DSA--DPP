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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head ;
        ListNode dummy = new ListNode(0); 
        dummy.next = head ;

        ListNode leftprev = dummy ; 
        ListNode curr = head ;
        for(int i =1 ; i< left ; i++){
            leftprev = leftprev.next ;
            curr = curr.next ; 
        }

        ListNode lefthead = curr ; 

        ListNode prev = null ;
        ListNode next ;
        for(int i = 1 ; i<= right-left+1 ; i++){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ; 
        }

        leftprev.next = prev ;
        lefthead.next = curr ; 

        return dummy.next ;
    }
}