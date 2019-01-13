/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution_recursive {
//     /**
//      * It is an O(N^2), memory O(N) (?) algorithm. Not recommended.
//      */
//     public ListNode reverseList(ListNode head) {
//         // Now implement a recursive one.
//         if (head == null || head.next == null) {
//             return head;
//         }
//         ListNode reversed = reverseList(head.next);
//         // Traverse to the end of reversed.
//         ListNode ptr = reversed;
//         while (ptr.next != null) {
//             ptr = ptr.next;
//         }
//         ptr.next = head;
//         head.next = null; // This is important.
//         return reversed;
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
        /* Note here. reversed points at the last element 
            (the first element in reversed list) of the original list.
            But, head still points at the element after it in the original list,
            which is now the last element in the reversed list. */
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}