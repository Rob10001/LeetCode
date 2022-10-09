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
        int length = 1;
        ListNode current = head;
        while(current.next != null) {
            length++;
            current = current.next;
        }
        current = head;
        for(int i = 0; i < length/2; i++) 
            current = current.next;
        return current;
    }
}