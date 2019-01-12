/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode ptr = head;
        while (ptr.next != null) {
            if (ptr.next.val != ptr.val) {
                ptr = ptr.next;
            } else {
                ptr.next = ptr.next.next;
            }
        }
        return head;
    }
}