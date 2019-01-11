/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        /*  Use two pointers.
            The first pointer iterates through the list to the kth position.
            If out of bound, jump back to head and continue.
            Then set second pointer to head.
            Traverse both of them until first pointer points to the end.
            move the latter part of the second pointer to the front of the head.
        */
        if (head == null) {
            return null;
        }
        ListNode ptr, prev;
        ptr = head;
        prev = head;
        // Iterate ptr.
        // However, if k is extremely large, this can be very slow.
        // We can have the length of the ListNode on the fly.
        int length = 0;
        for (int i = 0; i < k; i++) {
            length++;
            if (ptr.next == null) {
                // Now our lenght is the true length of list.
                // If you think about this, we want our ptr points at k % length.
                int desire = k % length;
                ptr = head;
                for (int j = 0; j < desire; j++) {
                    ptr = ptr.next;
                }
                break;
            }
            // if (ptr.next == null) {
            //     ptr = head;
            //     continue;
            // }
            ptr = ptr.next;
        }
        // Traverse both of them until ptr is the last.
        while (ptr.next != null) {
            ptr = ptr.next;
            prev = prev.next;
        }
        // Swap the list after prev to the front.
        ListNode newHead = prev.next;
        // which means the list do not need to be modified.
        // For example, k = 0.
        if (newHead == null) {
            return head;
        }
        prev.next = null;
        // Traverse to the end of newHead.
        ListNode endNewHead = newHead;
        while (endNewHead.next != null) {
            endNewHead = endNewHead.next;
        }
        endNewHead.next = head;
        head = newHead;
        return head;
    }
}