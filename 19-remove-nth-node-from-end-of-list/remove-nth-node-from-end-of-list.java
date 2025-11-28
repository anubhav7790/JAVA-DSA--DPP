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
        ListNode dummy = new ListNode(0) ; 
        dummy.next = head ; 
        ListNode curr = head ;
        ListNode prev = null ; 
        int size = 0; 
        while(curr != null){
            curr = curr.next ;
            size++; 
        }
        curr = head ;
        prev = dummy ; 
        while(curr != null){
        
          if(size == n){
            prev.next = curr.next ;

          }
          size-- ; 
          prev = curr ;
          curr = curr.next ; 

        }
        
      return dummy.next ; 

    }
}