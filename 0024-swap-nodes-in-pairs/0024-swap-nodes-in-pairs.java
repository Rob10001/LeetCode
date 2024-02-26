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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode holdHead = head.next;
        
        
        ListNode current = head;
        ListNode tempTwoAhead;
        while(current.next != null && current.next.next != null && current.next.next.next != null) {
            tempTwoAhead = current.next.next;
            current.next.next = current;
            current.next = tempTwoAhead.next;
            current = tempTwoAhead;
        }
        if(current.next.next == null) { //simply swap last two
            current.next.next = current;
            current.next = null;
        } else if(current.next.next.next == null) { //swap last two before the very last, keep very last at the end
            tempTwoAhead = current.next.next;
            current.next.next = current;
            current.next = tempTwoAhead;
        }
        return holdHead;
    }
}