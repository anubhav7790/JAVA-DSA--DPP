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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head ; 
        int count = 0 ; 
        int mid ; 
        while(curr.next != null){
            curr = curr.next ;
            count++ ; 
        }
        if(count%2 ==0){    //even -- odd nodes 
            mid = count/2 ;  
        }

        else {                 // odd -- even nodes
            mid = (count/2)+1 ; 
        }
        ListNode temp = head ; 
        for(int i = 0 ; i<=count ; i++ ){
            if(i==mid){
              head = temp ; 
               break ; 
            }
            else{
                temp = temp.next ; 
            }
        }

        return head ; 
    }
}