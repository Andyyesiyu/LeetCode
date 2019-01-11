/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if (head == null) {
        //     return null;
        // }
        // ListNode ptr, prev;
        // ptr = head;
        // int counter = 0;
        // for (int i = 0; i < n; i++) {
        //     counter++;
        //     if (ptr.next == null) {
        //         if (counter == n) {
        //             // Remove the head
        //             head = head.next;
        //             return head;
        //         }
        //         return null;
        //     }
        //     ptr = ptr.next;
        // }
        // prev = head;
        // while (ptr.next != null) {
        //     ptr = ptr.next;
        //     prev = prev.next;
        // }
        // prev.next = prev.next.next;
        // return head;
        
        /*  To avoid edge case like 1->2 n = 2, 
            we want to make removing the head the same as removing any other element.
            Thus, we introduce a sentinel node.
        */
        if (head == null) {
            return null;
        }
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode ptr, prev;
        ptr = sentinel;
        prev = sentinel;
        for (int i = 0; i < n; i++) {
            if (ptr.next == null) {
                return null;
            }
            ptr = ptr.next;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return sentinel.next;
    }
}