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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;
        
        
        // Check if there at least 2 elements in a linked list
        if(current == null || current.next == null){
            return head;
        }
        
        while(current.next != null){
            if(current.val == current.next.val){ // chekcing values for current and the next node
                current.next = current.next.next; // if it's true we point the next to the next next
            } else
                current = current.next; // else we move current forward.
            
        }
        
        return head;
        
    }
}