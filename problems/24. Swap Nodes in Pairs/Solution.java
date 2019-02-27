/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode result = head.next;
        ListNode third = head.next.next;
        head.next.next = head;
        head.next = swapPairs(third);
        return result;
    }
}