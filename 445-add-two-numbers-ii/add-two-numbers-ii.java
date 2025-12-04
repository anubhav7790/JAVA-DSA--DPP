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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       if( l1 == null && l2 == null) return null ; 

       l1 = reverse(l1); 
       l2 =  reverse(l2); 

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy ;
        int carry = 0;  

        while (l1 != null || l2 != null) {

            int v1 = 0;
            int v2 = 0;

            if (l1 != null) v1 = l1.val;
            if (l2 != null) v2 = l2.val;

            int sum = carry + v1 + v2;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;                 

            carry = sum / 10;

            if (l1 != null) l1 = l1.next;     
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);  
        }

         

         return reverse(dummy.next) ; 


          
    }

     public ListNode reverse(ListNode l){
            ListNode curr = l  ;
            ListNode prev = null ;
            ListNode next ;
            while(curr != null){
                next = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr = next ; 
            }
            
            
           return prev ;  
        }
}