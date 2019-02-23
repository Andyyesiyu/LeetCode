/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode p, q, prev;
        p = l1;
        q = l2;
        prev = result;
        while (true) {
            if (p == null) {
                prev.next = q;
                break;
            } else if (q == null) {
                prev.next = p;
                break;
            } else {
                if (p.val <= q.val) {
                    prev.next = p;
                    p = p.next;
                } else {
                    prev.next = q;
                    q = q.next;
                }
                prev = prev.next;
                prev.next = null;
            }
        }
        return result.next;
    }
}