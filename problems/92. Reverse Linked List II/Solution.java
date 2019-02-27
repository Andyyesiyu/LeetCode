/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        if (m != 1) {
            head.next = reverseBetween(head.next, m - 1, n - 1);
            return head;
        } else {
            if (n == 1) {
                return head;
            } else {
                ListNode result = reverseBetween(head.next, m, n - 1);
                ListNode temp = head.next.next;
                head.next.next = head;
                head.next = temp;
                return result;
            }
        }
    }
}