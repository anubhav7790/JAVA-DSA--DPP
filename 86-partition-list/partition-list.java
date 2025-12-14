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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0); 
        ListNode large = new ListNode(0); 
        ListNode tail1 = small ; 
        ListNode tail2 = large ; 

       while(head != null){
          if(head.val<x){
            tail1.next = new ListNode(head.val) ; 
            tail1 = tail1.next ;  
            
          }
          else{
             tail2.next = new ListNode(head.val); 
             tail2 = tail2.next ;  
          }

          head = head.next  ; 
       }
          

          tail1.next = large.next ;
          tail2.next = null ; 
      
      return small.next ; 
    }
}