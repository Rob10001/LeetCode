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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        int length = 1;
        ListNode current = head;
        while(current.next != null) {
            length++;
            current = current.next;
        }
        current = head;
        int[] half = new int[length/2];
        for(int i = 0; i < length/2; i++) {
            half[i] = current.val;
            current = current.next;
        }
        if(length % 2 == 1) current = current.next;
        for(int i = length/2 - 1; i > -1; i--) {
            if(current.val != half[i]) return false;
            current = current.next;
        }
        return true;
    }
}