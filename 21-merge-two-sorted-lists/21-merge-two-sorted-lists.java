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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode sort = new ListNode();
        ListNode sortHead = new ListNode();
        if(curr1.val < curr2.val) {
            sort = curr1;
            sortHead = sort;
            curr1 = curr1.next;
        } else {
            sort = curr2;
            sortHead = sort;
            curr2 = curr2.next;
        }
        
        while(curr1 != null && curr2 != null) {
            if(curr1.val < curr2.val) {
                sort.next = curr1;
                sort = sort.next;
                curr1 = curr1.next;
            } else {
                sort.next = curr2;
                sort = sort.next;
                curr2 = curr2.next;
            }
        }
        
        if(curr1 == null) {
            sort.next = curr2;
        } else if(curr2 == null) {
            sort.next = curr1;
        }
        return sortHead;
    }
}