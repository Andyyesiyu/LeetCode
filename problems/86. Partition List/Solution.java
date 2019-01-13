/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        // Create two list less and gE.
        // Traverse the linked list, put each element into the according list.
        // Concatenate two lists.
        if (head == null) {
            return null;
        }
        ListNode less, gE; // They are both sentinel node.
        ListNode lessLast, gELast;
        ListNode ptr;
        less = new ListNode(-1);
        gE = new ListNode(-1);
        lessLast = less;
        gELast = gE;
        ptr = head;
        
        while (ptr != null) {
            if (ptr.val < x) {
                lessLast.next = new ListNode(ptr.val);
                lessLast = lessLast.next;
            } else {
                gELast.next = new ListNode(ptr.val);
                gELast = gELast.next;
            }
            ptr = ptr.next;
        }
        lessLast.next = gE.next;
        return less.next;
    }
}